package uk.gov.ons.census.fwmt.tm.mock.controller;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;
import com.rabbitmq.client.GetResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/queue")
public class QueueController {

  @Value("${rabbitmq.host}")
  private String rabbitmqHost;

  @Value("${rabbitmq.username}")
  private String rabbitmqUsername;

  @Value("${rabbitmq.password}")
  private String rabbitmqPassword;

  @Value("${rabbitmq.port}")
  private int rabbitmqPort;

  @Value("${rabbitmq.virtualHost}")
  private String rabbitmqVirtualHost;

  @GetMapping(value = "/message", produces = "application/json")
  public ResponseEntity<String> getMessageOffQueue(@RequestParam("qname") String qname) {
    Connection connection = null;
    Channel channel = null;
    try {
      ConnectionFactory factory = getRabbitMQConnectionFactory();
      connection = factory.newConnection();
      channel = connection.createChannel();
      
      GetResponse response = channel.basicGet(qname, true);
      if (response == null) {
        return ResponseEntity.notFound().build();
      } else {
        byte[] body = response.getBody();
        log.info("recieved msg from Queue: " + qname);
        return ResponseEntity.ok(new String(body));
      }
    } catch (IOException | TimeoutException e) {
      log.error("Issue getting message from {} queue.", e, qname);
      return ResponseEntity.badRequest().build();
    } finally {
      try {
        if (channel != null)
          channel.close();
        if (connection != null)
          connection.close();
      } catch (Exception e) {
        log.error("Issue closing RabbitMQ connections", e);
      }
    }
  }

  @GetMapping(value = "/messagewithrouting", produces = "application/json")
  public ResponseEntity<String> getRabbitMessageOffQueue(@RequestParam("qname") String qname, @RequestParam("routingKey") String routingKey) {
    Connection connection = null;
    Channel channel = null;
    try {
      ConnectionFactory factory = getRabbitMQConnectionFactory();
      connection = factory.newConnection();
      channel = connection.createChannel();
      
      GetResponse response = channel.basicGet(qname, true);
      if (response == null || !response.getEnvelope().getRoutingKey().equals(routingKey)) {
        return ResponseEntity.notFound().build();
      } else {
        byte[] body = response.getBody();
        log.info("recieved msg from Queue: " + qname);
        return ResponseEntity.ok(new String(body));
      }
    } catch (IOException | TimeoutException e) {
      log.error("Issue getting message from {} queue.", e, qname);
      return ResponseEntity.badRequest().build();
    } finally {
      try {
        if (channel != null)
          channel.close();
        if (connection != null)
          connection.close();
      } catch (Exception e) {
        log.error("Issue closing RabbitMQ connections", e);
      }
    }
  }

  @GetMapping(value = "/count/{qname}", produces = "application/json")
  public ResponseEntity<Long> getMessageCount(@PathVariable("qname") String qname) {
    Connection connection = null;
    Channel channel = null;
    try {
      ConnectionFactory factory = getRabbitMQConnectionFactory();
      connection = factory.newConnection();
      channel = connection.createChannel();

      long messageCount = channel.messageCount(qname);
      log.info("recieved msg count from Queue: " + qname);
      return ResponseEntity.ok(messageCount);
    } catch (IOException | TimeoutException e) {
      log.error("Issue getting message count from {} queue.", qname, e);
      return ResponseEntity.badRequest().build();
    } finally {
      try {
        if (channel != null)
          channel.close();
        if (connection != null)
          connection.close();
      } catch (Exception e) {
        log.error("Issue closing RabbitMQ connections", e);
      }
    }
  }

  private ConnectionFactory getRabbitMQConnectionFactory() {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost(rabbitmqHost);
    factory.setUsername(rabbitmqUsername);
    factory.setPassword(rabbitmqPassword);
    factory.setVirtualHost(rabbitmqVirtualHost);
    return factory;
  }

  @PostMapping(value = "/")
  public ResponseEntity<Boolean> addMessage(@RequestParam("exchange") String exchange,
      @RequestParam("routingkey") String routingkey, @RequestBody String message) {
    Connection connection = null;
    Channel channel = null;
    try {
      ConnectionFactory factory = getRabbitMQConnectionFactory();
      connection = factory.newConnection();
      channel = connection.createChannel();

      BasicProperties.Builder builder = new BasicProperties.Builder();
      builder.contentType("text/xml");
      BasicProperties properties = builder.build();

      channel.basicPublish(exchange, routingkey, properties, message.getBytes());
      log.info("Published to exchange: " + exchange);

      return ResponseEntity.ok(true);
    } catch (IOException | TimeoutException e) {
      log.error("Issue adding message to {} exchange.", e, exchange);
      return ResponseEntity.badRequest().build();
    } finally {
      try {
        if (channel != null)
          channel.close();
        if (connection != null)
          connection.close();
      } catch (IOException | TimeoutException e) {
        log.error("Issue closing RabbitMQ connections", e);
      }
    }
  }

  @DeleteMapping()
  public ResponseEntity<Boolean> deleteMessage(@RequestParam("qname") String qname) {
    Connection connection = null;
    Channel channel = null;
    try {
      ConnectionFactory factory = getRabbitMQConnectionFactory();
      connection = factory.newConnection();
      channel = connection.createChannel();

      channel.queuePurge(qname);
      log.info("Purged Queue: " + qname);

      return ResponseEntity.ok(true);
    } catch (IOException | TimeoutException e) {
      log.error("Issue deleting message from {} queue.", e, qname);
      return ResponseEntity.badRequest().build();
    } finally {
      try {
        if (channel != null)
          channel.close();
        if (connection != null)
          connection.close();
      } catch (IOException | TimeoutException e) {
        log.error("Issue closing RabbitMQ connections", e);
      }
    }
  }
}

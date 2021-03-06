package uk.gov.ons.census.fwmt.tm.mock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Slf4j
@ComponentScan(basePackages = {"uk.gov.ons.census.fwmt", "uk.gov.ons.census.fwmt.tm.mock.comet.api",
    "uk.gov.ons.census.fwmt.tm.mock.comet.configuration"})
public class Application implements CommandLineRunner {

  public static void main(String[] args) throws Exception {
    new SpringApplication(Application.class).run(args);
  }

  @Override
  public void run(String... arg0) throws Exception {
    if (arg0.length > 0 && arg0[0].equals("exitcode")) {
      throw new ExitException();
    }
  }

  class ExitException extends RuntimeException implements ExitCodeGenerator {
    private static final long serialVersionUID = 1L;

    @Override
    public int getExitCode() {
      return 10;
    }

  }
}

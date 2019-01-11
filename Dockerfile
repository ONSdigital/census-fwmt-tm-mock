FROM openjdk:11-jdk-slim
ARG jar
VOLUME /tmp
COPY $jar mock.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /mock.jar" ]

FROM openjdk:11-jre-slim
MAINTAINER Kieran Wardle <kieran.wardle@ons.gov.uk>
ARG jar
VOLUME /tmp
COPY $jar censusmocktm.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /censusmocktm.jar" ]

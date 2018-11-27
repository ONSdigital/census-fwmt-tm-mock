FROM openjdk:11-jre-slim
MAINTAINER Jacob Harrison <jacob.harrison@ons.gov.uk>
ARG jar
VOLUME /tmp
COPY $jar censusmocktm.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar /censusmocktm.jar" ]

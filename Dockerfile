FROM openjdk:8-jre-alpine

ARG JAR_FILENAME
COPY target/${JAR_FILENAME} /opt/jossemargt/galatea/cmsgalatea.jar

WORKDIR /opt/jossemargt/galatea

CMD ["java", "-jar", "cmsgalatea.jar"]
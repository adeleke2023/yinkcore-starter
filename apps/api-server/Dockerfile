
FROM openjdk:25-jdk-slim

WORKDIR /app

COPY target/api-server-0.0.1-SNAPSHOT.jar api-server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api-server.jar"]


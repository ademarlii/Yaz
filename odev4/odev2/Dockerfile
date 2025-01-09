
FROM openjdk:17-jdk-slim

# Yazar bilgisi
LABEL authors="Adem"


COPY target/odev2-0.0.1-SNAPSHOT.jar /app/odev2.jar


WORKDIR /app


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "odev2.jar"]

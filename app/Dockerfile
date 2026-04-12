FROM eclipse-temurin:21.0.3_9-jdk-alpine as build
COPY build/libs/*-SNAPSHOT.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
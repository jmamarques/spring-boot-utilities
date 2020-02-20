# Instructions

*Create maven Wrapper*
```console
mvn -N io.takari:maven:wrapper
```

*Run java*
```console
./mvnw package && java -jar target/spring-boot-docker-1.0-SNAPSHOT.jar
mvn package && java -jar target/spring-boot-docker-1.0-SNAPSHOT.jar
```

*Build container*
```console
docker build -t springio/spring-boot-docker .
```
-> Tag name : springio/spring-boot-docker of container

# Basis for Docker


*Dockerfile*
```
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

ARG -> could be passed via command build ```docker build --build-arg JAR_FILE=<path Jar> -t myorg/myapp .```

Run with docker ```docker run -p 8080:8080 myorg/myapp```
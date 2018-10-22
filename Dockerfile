FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp

ADD target/two57-user-service.jar /two57-user-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/two57-user-service.jar"]

FROM openjdk:21
EXPOSE 9090
ADD target/spring-boot-ci-cd-jenkins-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

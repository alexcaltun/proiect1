FROM openjdk:17
COPY target/aclabs2023-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["xjava", "-jar", "/app.jar"]
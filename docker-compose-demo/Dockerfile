FROM eclipse-temurin:21
MAINTAINER Image created using Dockerfile and used within docker-compose.yml
RUN mkdir /tmp/my_proj_jar
COPY target/docker-compose-demo-0.0.1-SNAPSHOT.jar /tmp/my_proj_jar
ENTRYPOINT ["java", "-jar", "/tmp/my_proj_jar/docker-compose-demo-0.0.1-SNAPSHOT.jar"]
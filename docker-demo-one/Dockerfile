FROM eclipse-temurin:21
MAINTAINER Image created using Dockerfile and pushed manually
RUN mkdir /tmp/my_proj_jar
COPY target/docker-demo-one-0.0.1-SNAPSHOT.jar /tmp/my_proj_jar
ENTRYPOINT ["java", "-jar", "/tmp/my_proj_jar/docker-demo-one-0.0.1-SNAPSHOT.jar"]
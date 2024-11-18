# Using docker-compose.yml with image created using Dockerfile:

BUILD and PUSH docker image to docker hub:  

1. Create application's jar inside target directory using maven command:  
   ```
   mvn clean install

2. Create Dockerfile, with base images as Java 21:  
   ```
   FROM eclipse-temurin:21  
   MAINTAINER Official image of Lokesh's project  
   RUN mkdir /tmp  
   COPY target/my_proj.jar /tmp  
   ENTRYPOINT ["java", "-jar", "/tmp/my_proj.jar"]

3. Build image from Dockerfile:  
   ```
   docker build . -t lokeshjavatech/docker_compose_demo_image

4. Inspect the image to validate information:  
   ```
   docker image inspect lokeshjavatech/docker_compose_demo_image

5. Upload docker image to dockerhub:  
   ```
   docker push docker.io/lokeshjavatech/docker_compose_demo_image:latest

PULL and RUN docker image from docker hub using docker-compose.yml:  

1. create docker-compose.yml file:
   ```
   services:
      my-docker-compose-demo-service:
         image: lokeshjavatech/docker_compose_demo_image
         ports:
            - "9090:8080"
         networks:
            - docker_compose_demo_network

   networks:
      docker_compose_demo_network: {}
   
2. Pull and run the image in single command:  
   ```
   docker compose up -d

3. Now access GET endpoint: http://localhost:9090/user

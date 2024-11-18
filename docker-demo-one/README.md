# Dockerfile

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
   docker build . -t lokeshjavatech/my_image

4. Inspect the image to validate information:  
   ```
   docker image inspect lokeshjavatech/my_image

5. Upload docker image to dockerhub:  
   ```
   docker push docker.io/lokeshjavatech/my_image:latest

PULL and RUN docker image from docker hub:  

1. Pull and run the image in separate commands:  
   ```
   docker pull lokeshjavatech/my_image:latest  --> it will automatically download from docker.io
   docker run -p 9090:8080 lokeshjavatech/my_image

2. Pull and run the image in single command:  
   ```
   docker run -p 9090:8080 lokeshjavatech/my_image  --> it will automatically download from docker.io

3. Now access GET endpoint: http://localhost:9090/user

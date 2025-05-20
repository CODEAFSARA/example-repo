FROM openjdk:17
EXPOSE 8080
ADD afsara01/spring-image.jar spring-image
ENTRYPOINT ["java" , "jar","/spring-image.jar"]

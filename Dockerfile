FROM openjdk:8
EXPOSE 8080
ADD target/devopsExample.jar devopsExample.jar
ENTRYPOINT ["java", "-jar" ,"devopsExample.jar"]
# Start with a base image containing java runtime
FROM eclipse-temurin:21-jdk

# Information around who maintains the image
MAINTAINER harshit.com

# Add the application's jar to the image
# Here below, it means that, copy all the stuff of jar file from target to my docker image along with base as openjdk 21
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
# When someone is trying to generate a container from my docker image, please execute below command
# in cmd also, we write this command :-  java -jar target/accounts-0.0.1-SNAPSHOT.jar , target is there cz that jar was present inside it but below one is docker image one
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
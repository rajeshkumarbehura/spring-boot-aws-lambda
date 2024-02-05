FROM mcr.microsoft.com/java/jre:17-zulu-alpine

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-aws-lambda-1.0.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

EXPOSE 80

# java -jar /opt/app/app.jar
#ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ENV}", "app.jar"]
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=dev", "app.jar"]
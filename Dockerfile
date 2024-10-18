FROM openjdk:17
LABEL maintainer ="github-action"
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} github-cation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/github-cation.jar"]


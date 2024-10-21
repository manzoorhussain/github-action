FROM openjdk:17
LABEL maintainer ="github-action"
EXPOSE 8080
ARG JAR_FILE=target/*.jar
#ADD ${JAR_FILE} github-cation.jar
ADD ${JAR_FILE} /opt/app/github-action.jar
WORKDIR /opt/app
#ENTRYPOINT ["java","-jar","/github-cation.jar"]
ENTRYPOINT ["java", "-jar", "/opt/app/github-action.jar"]


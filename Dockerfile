FROM openjdk:17
LABEL maintainer ="github-action"
EXPOSE 8080
ADD target/github-cation.jar github-cation.jar
ENTRYPOINT ["java","-jar","/github-cation.jar"]


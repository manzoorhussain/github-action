# Use OpenJDK 17 as the base image
FROM openjdk:17

# Set the maintainer label
LABEL maintainer="github-action"

# Expose the application port
EXPOSE 8080

# Create a directory for the app inside the container
RUN mkdir -p /usr/local/app

# Copy the JAR file from the local target directory to the app directory inside the container
ADD target/github-cation.jar /usr/local/app/github-cation.jar

# Set the working directory inside the container
WORKDIR /usr/local/app

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/usr/local/app/github-cation.jar"]

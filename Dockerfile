# Use the official OpenJDK 17 image as a base
FROM openjdk:17

# Expose port 8080 for the application
EXPOSE 8080

# Define the JAR file to be copied from the local target directory
ARG JAR_FILE=target/*.jar

# Copy the JAR file to /opt/app/ in the Docker container
ADD ${JAR_FILE} /opt/app/github-action.jar

# Set the working directory
WORKDIR /opt/app

# Specify the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/opt/app/github-action.jar"]

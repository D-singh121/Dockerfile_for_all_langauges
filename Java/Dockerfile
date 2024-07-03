# Use the official OpenJDK image from the Docker Hub
FROM openjdk:17-jdk-slim-buster

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/myapp.jar ./

# Run the application
CMD ["java", "-jar", "myapp.jar"]

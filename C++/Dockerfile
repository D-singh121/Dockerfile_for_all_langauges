# Use the official GCC image from the Docker Hub
FROM gcc:latest

# Set the working directory
WORKDIR /app

# Copy the source code
COPY . .

# Compile the application
RUN g++ -o myapp main.cpp

# Run the application
CMD ["./myapp"]

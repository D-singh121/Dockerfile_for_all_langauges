# Use the official Swift image from the Docker Hub
FROM swift:5.3

# Set the working directory
WORKDIR /app

# Copy the source code
COPY . .

# Build the application
RUN swift build

# Run the application
CMD [".build/debug/myapp"]

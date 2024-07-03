# Use the official Rust image from the Docker Hub
FROM rust:1.79.0-slim

# Set the working directory
WORKDIR /app

# Copy the source code
COPY . .

# Build the application
RUN cargo build --release

# Run the application
CMD ["./target/release/myapp"]

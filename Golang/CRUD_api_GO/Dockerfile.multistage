# Stage 1: Build the application (builder)
FROM golang:alpine3.20 AS builder

# Set working directory
WORKDIR /app

# Copy the source code
COPY . .

# Build the application
RUN go build -o myapp .

# Stage 2: Run the application (slim)
FROM alpine:3.20

# Set working directory
WORKDIR /app

# Copy the application binary from the builder stage
COPY --from=builder /app/myapp .

# Define the command to run the application
CMD ["./myapp"]
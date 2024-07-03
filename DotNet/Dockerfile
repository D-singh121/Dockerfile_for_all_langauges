# Use the official .NET SDK image from the Docker Hub
FROM mcr.microsoft.com/dotnet/sdk:5.0 AS build

# Set the working directory
WORKDIR /src

# Copy the csproj file and restore the dependencies
COPY *.csproj ./
RUN dotnet restore

# Copy the rest of the application code
COPY . .

# Build the application
RUN dotnet publish -c Release -o /app

# Use the official .NET runtime image for running the application
FROM mcr.microsoft.com/dotnet/aspnet:5.0

# Set the working directory
WORKDIR /app

# Copy the built files
COPY --from=build /app .

# Run the application
ENTRYPOINT ["dotnet", "myapp.dll"]

# Use the official Ruby image from the Docker Hub
FROM ruby:2.7-slim

# Set the working directory
WORKDIR /app

# Copy the Gemfile and Gemfile.lock
COPY Gemfile* ./

# Install the dependencies
RUN bundle install

# Copy the rest of the application code
COPY . .

# Expose the application port
EXPOSE 3000

# Run the application
CMD ["ruby", "app.rb"]

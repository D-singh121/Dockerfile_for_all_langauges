# Use the official PHP image from the Docker Hub
FROM php:7.4-apache

# Copy the source code into the Apache document root
COPY . /var/www/html/

# Expose the application port
EXPOSE 80

# ---------------------------//////////////////////////////------------------
# another from version
FROM php:8.2-cli
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
CMD [ "php", "./your-script.php" ]
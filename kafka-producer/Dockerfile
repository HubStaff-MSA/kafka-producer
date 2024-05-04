# Use the official OpenJDK 21 image from the Docker Hub
FROM openjdk:21-jdk-slim

# Set the maintainer label
LABEL maintainer="yehiaronldo@gmail.com"

# Set a volume for temporary data
VOLUME /tmp

# Expose the port your app runs on
EXPOSE 9200

# Copy the executable jar file from your target folder into the image
COPY target/kafka-producer-0.0.1-SNAPSHOT.jar app.jar

# Specify the entry point/command to run your app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

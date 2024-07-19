# Utilisez une image de base Java
FROM openjdk:17-jdk-slim

# Ajoutez un label maintainer
LABEL maintainer="fatma.ferchichi@esprit.tn"

# Ajoutez l'application JAR à l'image Docker
ARG JAR_FILE=target/DiscoverySv-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose le port de l'application
EXPOSE 8761

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]

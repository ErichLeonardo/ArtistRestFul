# Etapa de compilación
FROM maven:3.8.3-openjdk-17 AS build
LABEL authors="ErichHamm"
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa de producción
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/ArtistRestFul-0.0.1-SNAPSHOT.jar /app/ArtistRestFul.jar
EXPOSE 8080
CMD ["java", "-jar", "ArtistRestFul.jar"]

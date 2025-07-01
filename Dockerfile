FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app/maven_parent
RUN git clone https://github.com/nastya1989db/maven_calculator.git .
RUN mvn dependency:go-offline -B
RUN mvn clean package -DskipTests
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app/maven_parent
COPY --from=builder /app/maven_parent/total_v3/target/total_v3-1.0-SNAPSHOT-jar-with-dependencies.jar ./app_v3.jar

ENTRYPOINT ["java", "-jar", "app_v3.jar"]



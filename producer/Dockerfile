FROM openjdk:18.0.1.1-jdk-oraclelinux7
WORKDIR /app
COPY build/libs/producer-0.0.1-SNAPSHOT.jar producer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","producer-0.0.1-SNAPSHOT.jar"]
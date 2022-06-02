FROM openjdk:18.0.1.1-jdk-oraclelinux7
WORKDIR /app
COPY build/libs/consumer-0.0.1-SNAPSHOT.jar consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]
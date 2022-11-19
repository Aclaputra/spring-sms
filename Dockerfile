FROM openjdk:17-alpine
COPY target/*.jar ./
ENTRYPOINT ["java", "-jar", "/*.jar"]

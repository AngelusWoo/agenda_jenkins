FROM openjdk:17
COPY target/agenda-0.0.1-SNAPSHOT.jar /agenda_app.jar
CMD ["java", "-jar", "/agenda_app.jar"]
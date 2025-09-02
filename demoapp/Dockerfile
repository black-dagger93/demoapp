FROM eclipse-temurin:17

ARG JAR_FILE=target/demoapp-*.jar

EXPOSE 8080

# copy jar file and run it
RUN mkdir -p /app/demoapp/



COPY ${JAR_FILE} /app/demoapp/app.jar

ENTRYPOINT ["java", "-jar","/app/demoapp/app.jar"]

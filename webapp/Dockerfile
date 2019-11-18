# FIXME: I want to use multi stage Docker build but running Gradle deamon in builder is so slow...
# FROM gradle:6.0.0-jdk11 AS builder
# WORKDIR /usr/src/app/
# COPY . .
# RUN ["./gradlew", "clean", "build"]

FROM adoptopenjdk/openjdk11:jre-11.0.4_11
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
# COPY --from=builder /usr/src/app/build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]

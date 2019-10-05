FROM adoptopenjdk/openjdk11:jre-11.0.4_11
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

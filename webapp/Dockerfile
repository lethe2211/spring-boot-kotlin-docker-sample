FROM adoptopenjdk/openjdk11:jre-11.0.4_11
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
FROM openjdk:8-jre-alpine
COPY ./target/*.jar app.jar
RUN apk --no-cache add curl
ENTRYPOINT [ "java","-jar","/app.jar" ]
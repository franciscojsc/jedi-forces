FROM gradle:jdk14 as build
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY src src
RUN gradle build

FROM openjdk:14-jdk-alpine
WORKDIR /app
ARG APPLICATION=/usr/app/build/libs/*.jar
COPY --from=build ${APPLICATION} app.jar
EXPOSE 8080
RUN adduser -D francisco
USER francisco
ENTRYPOINT ["java", "-jar", "app.jar"]

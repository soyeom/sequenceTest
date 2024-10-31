FROM openjdk:17
ARG JAR_FILE=build/libs/sequenceTest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ./sequenceTest-0.0.1-SNAPSHOT.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./sequenceTest-0.0.1-SNAPSHOT.jar"]

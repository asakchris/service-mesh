# the first stage of build will extract the layers
FROM openjdk:14 as builder
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

# the second stage of build will copy the extracted layers
FROM openjdk:14
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["bash", "-c", "java ${JAVA_OPTS} org.springframework.boot.loader.JarLauncher"]

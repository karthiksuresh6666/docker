FROM openjdk:17-alpine
COPY target/opal-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
EXPOSE 8097
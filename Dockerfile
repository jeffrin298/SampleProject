FROM registry.access.redhat.com/ubi8/openjdk-8-runtime
COPY target/ResourceManagement-0.0.1-SNAPSHOT.jar /rmsapp.jar
EXPOSE 8333
ENTRYPOINT ["java", "-jar", "/rmsapp.jar"]

FROM registry.access.redhat.com/ubi8/openjdk-8-runtime
COPY target/ResourceManagement-0.0.1-SNAPSHOT /rmsapp.war
EXPOSE 8333
ENTRYPOINT ["java", "-war", "/rmsapp.war"]

FROM openjdk:18
COPY ./target/customer-service-*.jar /usr/local/bin/customer-service.jar
RUN chmod +x /usr/local/bin/customer-service.jar
ENTRYPOINT ["java", "-jar", "/usr/local/bin/customer-service.jar"]

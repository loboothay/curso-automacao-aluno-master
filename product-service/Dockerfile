FROM openjdk:18
COPY ./target/product-service-*.jar /usr/local/bin/product-service.jar
RUN chmod +x /usr/local/bin/product-service.jar
ENTRYPOINT ["java", "-jar", "/usr/local/bin/product-service.jar"]

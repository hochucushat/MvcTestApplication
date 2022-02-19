FROM maven:3.8.4-jdk-11
COPY . /app
WORKDIR /app
RUN mvn clean package
RUN chmod -R 777 target/mtapp-0.0.1.war
CMD ["java", "-jar", "target/mtapp-0.0.1.war"]
FROM maven
MAINTAINER Aman
COPY ./ ./
RUN mvn package
ENTRYPOINT ["java", "-jar", "target/Department-0.0.1-SNAPSHOT.jar"]

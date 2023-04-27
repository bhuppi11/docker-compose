FROM maven
MAINTAINER Aman
COPY ./ ./
RUN mvn package
ENTRYPOINT ["java","-jar","target/Employee-0.0.1-SNAPSHOT.jar"]
FROM openjdk:16-alpine3.13
MAINTAINER com.corebank.zac.main
COPY target/zac-0.0.1-SNAPSHOT.jar zac-0.0.1.jar
ENTRYPOINT ["java","-jar","/zac-0.0.1.jar"]

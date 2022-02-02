FROM openjdk:8
ADD target/sample.jar sample.jar
ENTRYPOINT ["java","-jar","sample.jar"]
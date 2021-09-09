FROM amazoncorretto:11
ADD eureka.jar eureka.jar
ADD user.jar user.jar
EXPOSE 8010
ENTRYPOINT ["java", "-jar", "user.jar"]
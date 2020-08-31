FROM openjdk:14-alpine
COPY build/libs/distributed-config-*-all.jar distributed-config.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "distributed-config.jar"]
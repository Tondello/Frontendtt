FROM amazoncorretto:1.8-alpine-jdk // de que imagen partimos
MAINTAINER Tomas // quien es el dueño
COPY  target/tomas-0.0.1-SNAPSHOT.jar tomas-app.jar    //va a copiar el empaquetado a github
ENTRYPOINT ["java","-jar", "/tomas-app.jar"]   //es la instruccion que se va a ejecutar primero

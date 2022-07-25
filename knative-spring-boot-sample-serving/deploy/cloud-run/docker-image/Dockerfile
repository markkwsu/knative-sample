FROM openjdk:8-jdk-alpine
COPY knative-spring-boot-sample-serving-1.0.jar knative-spring-boot-sample-serving-1.0.jar
ENTRYPOINT ["java","-jar","/knative-spring-boot-sample-serving-1.0.jar"]
USER root
ENV TZ=Asia/Taipei
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
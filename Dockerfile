FROM hub.c.163.com/library/java:openjdk-8-jre
MAINTAINER zuowan
COPY du-service/target/du-service-1.0-SNAPSHOT.jar /app.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
EXPOSE  20880
ENTRYPOINT ["java","-jar","/app.jar"]
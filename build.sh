#!/usr/bin/env bash

mvn clean package

#docker rmi registry.cn-hangzhou.aliyuncs.com/zuowan/du-service:latest
docker build -t registry.cn-beijing.aliyuncs.com/zuowan/du-service:v7 .
docker push registry.cn-beijing.aliyuncs.com/zuowan/du-service:v7


#docker run -d -e host=192.168.0.103 registry.cn-hangzhou.aliyuncs.com/zuowan/du-service:latest
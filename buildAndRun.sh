#!/bin/sh
mvn clean package && docker build -t com.horacioJunior/fist-jakarta-rest-api .
docker rm -f fist-jakarta-rest-api || true && docker run -d -p 9080:9080 -p 9443:9443 --name fist-jakarta-rest-api com.horacioJunior/fist-jakarta-rest-api
@echo off
call mvn clean package
call docker build -t com.horacioJunior/fist-jakarta-rest-api .
call docker rm -f fist-jakarta-rest-api
call docker run -d -p 9080:9080 -p 9443:9443 --name fist-jakarta-rest-api com.horacioJunior/fist-jakarta-rest-api
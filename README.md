# spring-boot-docker-demo
Demo to show run springboot using Docker in IDEA.
## docker configuration
**/home/developer/app/logs/** directory was created by Docker.
```
docker build -t docker-demo:1.1 .
&& docker run
-p 8990:8990
-v /Users/gaojian/log/docker/:/home/developer/app/logs/
--name docker-server
docker-demo:1.1 
```
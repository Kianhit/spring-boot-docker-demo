FROM openjdk:8-jdk-alpine
ADD *.jar app.jar
# ADD指令的功能是将主机构建环境（上下文）目录中的文件和目录、以及一个URL标记的文件 拷贝到镜像中。
# 其格式是： ADD  源路径  目标路径
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# SecureRandom在java各种组件中使用广泛，可以可靠的产生随机数。但在大量产生随机数的场景下，性能会较低。
# 这时可以使用"-Djava.security.egd=file:/dev/./urandom"加快随机数产生过程。
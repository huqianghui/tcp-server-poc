# 该镜像需要依赖的基础镜像
FROM mcr.microsoft.com/openjdk/jdk:8-mariner
# 将当前目录下的jar包复制到docker容器的/目录下
ADD ./target/tcp-server-0.0.1-SNAPSHOT.jar /myapp.jar
CMD java -jar myapp.jar
# 声明服务运行在8888端口
EXPOSE 8888
# 指定维护者的名字
MAINTAINER huqianghui
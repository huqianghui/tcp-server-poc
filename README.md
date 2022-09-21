# tcp-server-poc

1. 代码拉取下来，build jar，然后通过docker来build tcp-server镜像，tcp-client放到本地即可作为连通性测试发起端。
这里有jib一直出现main class找不到的错误，无赖只好通过Dockerfile来打镜像。

2. 把镜像打上azure container registery 的名称，然后push 到镜像ACR中

3. 通过外层的deployment 和 load balancer 文件，发布到aks中。
这个aks要关联上述acr

4. 修改tcp-client里面的server地址为LB的external 地址，端口保持不变8888.

5. 启动tcp-client

6. 通过run test case的方式，产看运行结果。


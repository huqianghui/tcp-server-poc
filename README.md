# tcp-server-poc

1. 代码拉取下来，build jar，然后通过docker来build tcp-server镜像，tcp-client放到本地即可作为连通性测试发起端。
这里有jib一直出现main class找不到的错误，无赖只好通过Dockerfile来打镜像。

2. 把镜像打上azure container registery 的名称，然后push 到镜像ACR中

3. 通过外层的deployment 和 load balancer 文件，发布到aks中。
这个aks要关联上述acr

4. 修改tcp-client里面的server地址为LB的external 地址，端口保持不变8888.

5. 启动tcp-client

6. 通过run test case的方式，产看运行结果。

case 1） 通过client 访问
<img width="1395" alt="Screen Shot 2022-09-21 at 9 50 01 AM" src="https://user-images.githubusercontent.com/7360524/191396414-2dd01ea7-095b-45ec-9cb6-7f4fb20f6ff5.png">


case2） 通过curl 直接访问LB

<img width="645" alt="Screen Shot 2022-09-21 at 9 50 40 AM" src="https://user-images.githubusercontent.com/7360524/191396470-1a3ce4a3-70b7-4061-98fd-f3f975abcccc.png">


case 3） 通过azure application gateway访问
<img width="1438" alt="Screen Shot 2022-09-21 at 9 51 24 AM" src="https://user-images.githubusercontent.com/7360524/191396550-454dbcdd-abbd-4f5f-b8f8-e45722dbc9c3.png">

# jenkins-playground
Repository for testing JenkinsFile 

# 创建
## Jenkins用法 
*  1 命名 playground2groovy 
*  2 选择 流水线（pipline）
> 配置 编辑选项：Pipline 选择： Pipline script from SCM <br>
  选择版本控制工具：Git，填写git地址：https://github.com/tomlee130/jenkins-playground.git<br>
  配置Script Path：填写ios/JenkinsFile<br>
*  3 Build

## 输出
```groovy
Obtained ios/JenkinsFile from git https://github.com/esafirm/jenkins-playground.git
Running in Durability level: MAX_SURVIVABILITY
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Mac mini (2018) in /Users/pack/jenkins/workspace/Jenkins用法/jenkins-playground
[Pipeline] {
[Pipeline] echo
Testing
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
```

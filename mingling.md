##### 1.配置用户名（提交时引用）
###### git config --global user.name “你的用户名”
##### 2.配置邮箱
###### git config --global user.email “你的邮箱”
##### 3.编码配置
#####  避免git  gui中的中文乱码
######  git config --global core.quotepath off
##### 4.其他
###### git config --global croe.ignorecase false
##### git ssh key pair 配置
#####1.在git bash命令行窗口中输入
###### ssh-keygen -t rsa -C “你的邮箱”
###### 2.然后一路回车，不要输入任何密码之类，生成 ssh key pair
###### 3.在用户目录下生成.ssh文件夹，找到公钥和私钥
###### Id_rsa id_rsa.pub
###### 4.将公钥的内容复制
###### 5.进入github 网站，将公钥添加进去
###### git init 创建本地仓库
###### git add 添加到暂存区
###### git commit -m "描述"提交到本地仓库
###### git status 检查工作区文件状态
###### git log查看提交 committed
###### git reset --hard committed 版本回退
######  git branch 查看分支
######  git checkout -b dev 创建并切换到dev分支
######  git checkout 分支名   切换分支
######  git pull 拉取
######  git push -u origin master 提交到远程仓库
######  git merge branchname   分支合并
######  git remote add origin "远程仓库地址"   关联远程仓库
######  git add .  提交所有
###### 创建分支  git checkout -b v1.0 origin/master
###### 将分支推送到远程仓库    git push origin HEAD -u
###### git clone ssh 地址  克隆地址
###### git branch -d 分知名 删除分支
######  git fetch 将更新git remote 中的所有远程repo所包含分支的最新commit-id，将其记录到git/FETCH_HEAD文件中
###### ssh -T git@github.com
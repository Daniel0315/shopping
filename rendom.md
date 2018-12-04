### 一、用户模块
###### 1.登录
###### 2.注册
###### 3.修改密码
###### 4.记住密码
###### 5.退出
###### 6.获取用户信息
### 二、商品模块
##### 后台
###### 添加商品
###### 修改商品信息
###### 删除商品
###### 商品上下架
###### 查看商品
##### 前台
###### 搜索商品
###### 查看商品详情
### 三、类别模块
###### 添加类别
###### 删除类别
###### 修改类别
### 四、购物车模块
###### 添加购物车
###### 修改购物车中某个商品的数量
###### 删除购物车商品
###### 全选/取消全选
###### 单选/取消单选
###### 查看购物车中商品数量
### 五、地址模块
###### 添加地址信息
###### 修改地址信息
###### 删除地址信息
###### 查看地址信息
### 六、订单模块
##### 前台
###### 查看订单
###### 修改订单
###### 取消订单
###### 订单详情
##### 后台
###### 订单列表
###### 订单详情
### 七、支付模块
###### 支付宝支付
###### 支付  
###### 支付回调
###### 查看支付状态
### 八、线上部署
###### 阿里云部署

------------------20181204------------------
###数据库设计：
#####创建数据库
```
create database shopping;
use shopping;
```
#####用户表(user)
```
create table user(
`user_id`       int(11)     not null  auto_increment comment'用户ID',
`username`      varchar(50) not null  comment'用户账号',
`password`      varchar(50) not null  comment'用户密码',
`email`         varchar(50) not null  comment'用户邮箱',
`phone`         varchar(50) not null  comment'用户手机号',
`question`      varchar(50) not null  comment'问题',
`answer`        varchar(50) not null  comment'答案',
`role`          int(4)      not null  default 0      comment'角色',
`create_time`   datetime    comment'注册时间',
`update_time`   datetime    comment'修改时间',
primary key (`user_id`),
UNIQUE KEY `user_name_index` (`username`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
#####类别表(category)
```
create table category(
`cate_id`        int(11)     not null  auto_increment comment'类型ID',
`parent_id`      int(11)     not null  default 0      comment'父类id',
`name`           varchar(50) not null   comment'类别名称',
`status`        int(4)      default 1   comment'类别状态 1：正常 0：废弃',
`create_time`   datetime    comment'创建时间',
`update_time`   datetime    comment'修改时间',
primary key (`cate_id`)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
####商品表(product)
```
create table product(
`pro_id`        int(11)         not null auto_increment comment'商品id',
`cate_id`       int(11)         not null comment'商品所属的类型id，值引用类型别表的id',
`name`          varchar(100)    not null comment'商品名称',
`detail`        text            comment'商品详情',
`subtitle`      varchar(200)    comment'商品副标题',
`main_image`    varchar(100)    comment'商品主图',
`sub_images`    varchar(200)    comment'商品子图',
`price`         decimal(20,2)   not null comment'商品价格',
`stock`         int(11)         comment'商品库存',
`status`        int(6)          default 1 comment'商品状态：1：在售 2：下架 3：删除',
`create_time`   datetime        comment'创建时间',
`update_time`   datetime        comment'修改时间',
primary key (`pro_id`)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
####购物车表(cart)
```
create table cart(
`cart_id`           int(11)     not null auto_increment comment'购物车id',
`user_id`           int(11)     not null                comment'用户id',
`pro_id`            int(11)     not null                comment'商品id',
`quantity`          int(11)     not null                comment'购买数量',
`checked`           int(4)      default 1               comment'1:选中 2：未选中',
`create_time`       datetime                            comment'创建时间',
`update_time`       datetime                            comment'修改时间',
primary key (`cart_id`),
key `user_id_index` (`user_id`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
####订单表(ordertable)
```
create table ordertable(
 `order_id`     int(11)       not null  auto_increment comment'订单id,主键',
 `order_no`     bigint(20)    not null                 comment '订单编号',
 `user_id`      int(11)       not null                 comment '用户id',
 `payment`      decimal(20,2) not null                 comment '付款总金额，单位元，保留两位小数',
 `payment_type` int(4)        not null  default 1      comment '支付方式 1:线上支付 ',
 `status`       int(10)       not null                 comment '订单状态 0-已取消  10-未付款 20-已付款 30-已发货 40-已完成  50-已关闭',   
 `shipping_id`  int(11)       not null                 comment '收货地址id',
 `postage`      int(10)       not null  default 0 comment '运费', 
 `payment_time` datetime  default null  comment '已付款时间',
 `send_time`    datetime  default null  comment '已发货时间',
 `close_time`   datetime  default null  comment '已关闭时间',
 `end_time`     datetime  default null  comment '已结束时间',
 `create_time`  datetime  default null  comment '已创建时间',
 `update_time`  datetime  default null  comment '更新时间',
  PRIMARY KEY(`order_id`),
  UNIQUE KEY `order_no_index`(`order_no`) USING BTREE
 )ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
####订单明细表(user)
```
create table order_item(
 `id`           int(11)    not null  auto_increment comment '订单明细id,主键',
 `order_no`     bigint(20) not null  comment '订单编号',
 `user_id`      int(11)  not null  comment '用户id',
 `product_id`   int(11)  not null comment '商品id',
 `product_name` varchar(100)  not null comment '商品名称',
 `product_image`  varchar(100)  comment '商品主图', 
 `current_unit_price` decimal(20,2) not null comment '下单时商品的价格，元为单位，保留两位小数',
 `quantity`     int(10)  not null comment '商品的购买数量',
 `total_price`  decimal(20,2) not null comment '商品的总价格，元为单位，保留两位小数',
 `create_time`    datetime  default null  comment '已创建时间',
 `update_time`    datetime  default null  comment '更新时间',
  PRIMARY KEY(`id`),
  KEY `order_no_index`(`order_no`) USING BTREE,
  KEY `order_no_user_id_index`(`order_no`,`user_id`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
```
####地址表(address)
````
create table address(
`add_id`       int(11)      not null  auto_increment,
`user_id`       int(11)      not  null  ,
`receiver_name`       varchar(20)      default   null  COMMENT '收货姓名' ,
`receiver_phone`       varchar(20)      default   null  COMMENT '收货固定电话' ,
`receiver_mobile`       varchar(20)      default   null  COMMENT '收货移动电话' ,
`receiver_province`       varchar(20)      default   null  COMMENT '省份' ,
`receiver_city`       varchar(20)      default   null  COMMENT '城市' ,
`receiver_district`       varchar(20)      default   null  COMMENT '区/县' ,
`receiver_address`       varchar(200)      default   null  COMMENT '详细地址' ,
 `receiver_zip`       varchar(6)      default   null  COMMENT '邮编' ,
`create_time`       datetime      not null   comment '创建时间',
`update_time`       datetime      not null   comment '最后一次更新时间',
 PRIMARY KEY(`add_id`)
)ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
####支付表(pay)
````
####支付表
````
create table pay( 
`pay_id` int(11) not null auto_increment comment '主键',
 `order_no` bigint(20) not null comment '订单编号',
  `user_id` int(11) not null comment '用户id',
   `pay_platform` int(4) not null default 1 comment '1:支付宝 2:微信',
`platform_status` varchar(50) comment '支付状态', 
`platform_number` varchar(100) comment '流水号',
 `create_time` datetime default null comment '已创建时间',
  `update_time` datetime default null comment '更新时间',
   PRIMARY KEY(`pay_id`) 
   )ENGINE=InnoDB DEFAULT CHARSET=UTF8;
````

### 项目架构
#### 四层架构：
##### 视图层
##### 控制层controller
##### 逻辑业务层service
##### dao层 进行数据库的操作

 
 #### Mybatis-generator插件
 ##### 引入org.mybatis.generator.jar包
 ##### 配置generarorConfig.xml文件
 ###### 配置properties文件
 ###### 配置mysql的jar包
 ###### 在jdbcConnection中配置驱动，密码，用户名，数据库路径
 ###### 配置实例类路径 targetProject是从src开始的：src/main/java
 ###### 配置sql映射文件路径 targetProject是从src开始的：src/main/resources
 ###### 配置生成dao接口的路径 targetProject是从src开始的：src/main/java
 ###### 配置数据库的表 
 
 ### 搭建SSM框架
 #### spring.xml
 ##### 开启注解：
 ###### 通过component-scan来对指定路径下的所有文件扫描
 ##### 开启基于注解的实物配置：
 ###### 通过annotation-driven
 ##### 配置数据源
 ###### 创建DruidDataSource的对象
 ###### 给driverClassName，url,username,password赋值，利用${}
 ##### 配置SqlSessionFactoryBean
 ###### configLocation：classpath:mybatis-config.xml
 ###### mapperLocations：classpath:com/neuedu/mapping/*Mapper.xml
 ###### mapperLocations：classpath:com/neuedu/mapping/*Mapper.xml
 ##### 配置mybatis Dao接口的代理实现类
 #### springmvc.xml
 ##### component-scan:
 ###### 通过注解配置扫描controller包
 ##### 配置返回的数据类型
 ###### MappingJackson2HttpMessageConverter配置json
 #### web.xml
 ##### 加载spring配置文件
 ###### classpath:spring.xml
 ##### 加载监听器
 ##### 加载DispacherServlet
 ###### 配置springmvc.xml
 ##### dispacherservlet
 ###### /指缺省路径
 
 #### Controller
 ##### @RestController
 ###### 指方法返回的是json格式的数据
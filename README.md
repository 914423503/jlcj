计量采集种子项目

实现采集端以及接收端的通讯问题。通讯框架采用vert.x。消息队列使用 rabbitmq。该项目主要用于搭建其他通讯类的项目使用。
使用技术：spring boot，spring cloud，vert.x,radditmq
device-gather:socket 服务端。主要作用是，接收到消息后，直接丢到rabbitmq 的队列中。
device-resolve：消息处理客户端。主要作用是，从消息队列中获取消息，之后再做解析处理。

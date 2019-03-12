package com.cnten.deviceresolve.receiver.impl;

import com.cnten.deviceresolve.receiver.AbstractReceiver;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "collection")
public class DeviceReceiver implements AbstractReceiver{

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver get msg: " + hello);
    }
}

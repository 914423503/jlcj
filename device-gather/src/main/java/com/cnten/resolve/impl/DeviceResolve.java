package com.cnten.resolve.impl;

import com.cnten.resolve.AbstractResolve;
import com.cnten.sender.DeviceSender;
import io.vertx.core.net.NetSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: gaoTeng
 * @Date: 2018/9/4 0004
 * @Description:
 */
@Component
public class DeviceResolve implements AbstractResolve {
	@Autowired
	private DeviceSender deviceSender;
	@Override
	public void resolve(String data, NetSocket socket) {
		System.out.println("server receive msg:"+data);
		deviceSender.send(data);
	}
}

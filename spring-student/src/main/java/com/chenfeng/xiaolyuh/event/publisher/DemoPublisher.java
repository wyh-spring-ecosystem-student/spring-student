package com.chenfeng.xiaolyuh.event.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.chenfeng.xiaolyuh.event.custom_event.DemoEvent;

/**
 * 
 * @ClassName DemoPublisher
 * @Description 发布事件
 * @author yuhao.wang
 * @Date 2017年3月14日 下午2:14:20
 * @version 1.0.0
 */
@Component
public class DemoPublisher {
	@Autowired
	// 注入容器applicationContext用来发布事件
	ApplicationContext applicationContext;
	
	public void publish(String msg){
		// 使用applicationContext的publishEvent方法来发布。
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
}

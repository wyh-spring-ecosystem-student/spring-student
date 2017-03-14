package com.chenfeng.xiaolyuh.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.chenfeng.xiaolyuh.event.custom_event.DemoEvent;

/**
 * 
 * @ClassName DemoListener
 * @Description 事件监听器，实现ApplicationListener的接口并指定监听的事件类型。
 * @author yuhao.wang
 * @Date 2017年3月14日 下午1:59:50
 * @version 1.0.0
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	// 使用onApplicationEvent方法对消息进行接收处理。
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我（bean-demoListener）接收到了Bean-demoPublisher发布的消息：" + msg);
	}

}

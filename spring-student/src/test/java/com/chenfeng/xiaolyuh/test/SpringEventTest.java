package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.event.config.EventConfig;
import com.chenfeng.xiaolyuh.event.publisher.DemoPublisher;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class SpringEventTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

	@Test
	public void contextTest() {
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		demoPublisher.publish("Hello Application Event");
	}

	@After
	public void closeContext() {
		context.close();
	}

}

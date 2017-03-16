package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.aware.config.AwareConfig;
import com.chenfeng.xiaolyuh.aware.service.DemoAwareService;

public class SpringAwareTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

	@Test
	public void contextTest() {
		DemoAwareService demoAwareService = context.getBean(DemoAwareService.class);
		System.out.println(demoAwareService.toString());
	}

	@After
	public void closeContext() {
		context.close();
	}

}

package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.thread.config.ThreadConfig;
import com.chenfeng.xiaolyuh.thread.service.DemoThreadService;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class SpringThreadTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreadConfig.class);

	@Test
	public void contextTest() {
		DemoThreadService demoThreadService = context.getBean(DemoThreadService.class);
		for (int i = 0; i < 1000; i++) {
			demoThreadService.executeAsyncTaskPlus(i);
			demoThreadService.executeAsyncTask(i);
		}
	}

	@After
	public void closeContext() {
		context.close();
	}

}

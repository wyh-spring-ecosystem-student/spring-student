package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.config.AopConfig;
import com.chenfeng.xiaolyuh.service.DemoAOPAnnotationService;
import com.chenfeng.xiaolyuh.service.DemoAOPMethodService;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class SpringAopTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

	@Test
	public void contextTest() {
		DemoAOPAnnotationService annotationService = context.getBean(DemoAOPAnnotationService.class);
		DemoAOPMethodService methodService = context.getBean(DemoAOPMethodService.class);

		annotationService.add();
		methodService.add();
	}

	@After
	public void closeContext() {
		context.close();
	}

}

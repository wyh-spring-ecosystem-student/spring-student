package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.el.config.ELConfig;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class SpringELTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);

	@Test
	public void contextTest() {
		ELConfig elConfig = context.getBean(ELConfig.class);
		System.out.println(elConfig.toString());
	}

	@After
	public void closeContext() {
		context.close();
	}

}

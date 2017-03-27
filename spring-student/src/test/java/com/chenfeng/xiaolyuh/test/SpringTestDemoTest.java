package com.chenfeng.xiaolyuh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenfeng.xiaolyuh.test.config.TestConfig;
import com.chenfeng.xiaolyuh.test.service.DemoTestService;

@RunWith(SpringJUnit4ClassRunner.class)// SpringJUnit4ClassRunner再Junit环境下提供Spring TestContext Framework的功能。
@ContextConfiguration(classes = {TestConfig.class})// @ContextConfiguration用来加载配置ApplicationContext，其中classes用来加载配置类
public class SpringTestDemoTest {
	@Autowired// 注入Bean
	private DemoTestService demoTestService;
	
	@Test
	public void contextTest() {
		demoTestService.outputResult();
	}

}

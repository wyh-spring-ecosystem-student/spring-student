package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.annotation.config.CombinationAnnotationConfig;
import com.chenfeng.xiaolyuh.annotation.service.DemoCombinationAnnotationService;

public class SpringCombinationAnnotationTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CombinationAnnotationConfig.class);

	@Test
	public void contextTest() {
		DemoCombinationAnnotationService demoCombinationAnnotationService = context.getBean(DemoCombinationAnnotationService.class);
		demoCombinationAnnotationService.outputResult();
	}

	@After
	public void closeContext() {
		context.close();
	}

}

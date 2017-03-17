package com.chenfeng.xiaolyuh.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.scheduled.config.ScheduledConfig;

public class SpringScheduledTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
	}
}

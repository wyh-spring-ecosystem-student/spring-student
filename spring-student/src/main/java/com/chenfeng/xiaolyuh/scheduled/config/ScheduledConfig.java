package com.chenfeng.xiaolyuh.scheduled.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages={"com.chenfeng.xiaolyuh.scheduled"})
@EnableScheduling// 通过 @EnableScheduling注解开启对计划任务的支持
public class ScheduledConfig {
	
}
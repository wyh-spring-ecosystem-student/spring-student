package com.chenfeng.xiaolyuh.scheduled.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 定时任务的测试类
 */
@Service
public class DemoScheduleService {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)// 使用@Scheduled注解声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
	public void reportCurrentTime() {
		System.out.println("fixedRate 每5秒执行一次：" + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 15 16 ? * *")// 使用cron属性可以按照指定时间实行，本列是16点15分执行；cron是UNIX和类UNIX（linux）系统下的定时任务
	public void fixTimeExecution() {
		System.out.println("在指定时间执行 " + dateFormat.format(new Date()));
	}

	@Scheduled(fixedDelay = 4000)
	public void fixedDelayExecution() {
		System.out.println("fixedDelay 在指定时间执行 " + dateFormat.format(new Date()));
	}
}

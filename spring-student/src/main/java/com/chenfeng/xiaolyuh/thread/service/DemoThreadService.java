package com.chenfeng.xiaolyuh.thread.service;

import java.util.concurrent.Executor;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 多线程的测试类
 * @ClassName DemoELService
 * @author yuhao.wang
 * @Date 2017年3月10日 下午3:41:18
 * @version 1.0.0
 */
@Service
public class DemoThreadService {
	
	@Resource(name = "getThreadPool")
	private Executor executor;
	
	@Async
	// 通过@Async注解方法表名这个方法是一个异步方法，如果注解在类级别，则表名该类的所有方法都是异步的，
	// 而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务：" + i);
	}
	
	public void executeAsyncTaskPlus(Integer i) {
		executor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("执行异步任务+1：" + i);
			}
		});
	}
}

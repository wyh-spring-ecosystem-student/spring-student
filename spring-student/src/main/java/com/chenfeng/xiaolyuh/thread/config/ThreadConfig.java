package com.chenfeng.xiaolyuh.thread.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration // 声明当前类是一个配置类，相当于Spring配置的XML文件
@ComponentScan(basePackages={"com.chenfeng.xiaolyuh.thread"})
@EnableAsync// 利用@EnableAsync注解开启异步任务的支持
// 配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回ThreadPoolTaskExecutor，这样我们就获得了一个基于线程池TaskExecutor
public class ThreadConfig implements AsyncConfigurer {

	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		// 核心线程数 
		taskExecutor.setCorePoolSize(5); 
		// 最大线程数
		taskExecutor.setMaxPoolSize(50); 
		// 队列最大长度
		taskExecutor.setQueueCapacity(1000);
		// 空闲线程的存活时间(单位秒)
		taskExecutor.setKeepAliveSeconds(120);
		// 线程池对拒绝任务(无线程可用)的处理策略 ThreadPoolExecutor.CallerRunsPolicy策略 ,调用者的线程会执行该任务,如果执行器已关闭,则丢弃.
		taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
		
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Bean
	public Executor getThreadPool() {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(1000);
		taskExecutor.setQueueCapacity(1000);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
		
}
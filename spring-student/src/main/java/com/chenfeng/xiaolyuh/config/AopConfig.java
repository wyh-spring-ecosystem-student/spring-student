package com.chenfeng.xiaolyuh.config;

import static org.hamcrest.CoreMatchers.not;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 声明当前类是一个配置类，相当于Spring配置的XML文件
@ComponentScan(value="com.chenfeng.xiaolyuh", excludeFilters=not()) // 扫描包
@EnableAspectJAutoProxy // 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
public class AopConfig {
	
}
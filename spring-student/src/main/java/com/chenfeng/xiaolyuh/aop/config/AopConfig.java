package com.chenfeng.xiaolyuh.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;

import com.chenfeng.xiaolyuh.bean.config.BeanConfig;

@Configuration // 声明当前类是一个配置类，相当于Spring配置的XML文件
// 包扫描，并排除了对BeanConfig的扫描
@ComponentScan(basePackages={"com.chenfeng.xiaolyuh"}, excludeFilters={@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=BeanConfig.class)})
@EnableAspectJAutoProxy // 使用@EnableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
public class AopConfig {
	
}
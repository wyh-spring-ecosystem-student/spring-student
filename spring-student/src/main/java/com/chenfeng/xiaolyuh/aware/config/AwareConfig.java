package com.chenfeng.xiaolyuh.aware.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 声明当前类是一个配置类，相当于Spring配置的XML文件
@ComponentScan(basePackages={"com.chenfeng.xiaolyuh.aware"})
public class AwareConfig {
	
}
package com.chenfeng.xiaolyuh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chenfeng.xiaolyuh.entity.DogEntity;
import com.chenfeng.xiaolyuh.entity.InitBeanAndDestroyBean;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
@Configuration // 声明当前类是一个配置类，相当于Spring配置的XML文件
@ComponentScan("com.chenfeng.xiaolyuh") // 扫描包
public class BeanConfig {
	
	@Bean // 注解在方法上，声明当前方法返回值是一个Bean。Bean的名称默认是方法名。
	public DogEntity getDogEntity() {
		return new DogEntity();
	}

	// 测试Bean的几种初始化和销毁方式，和执行顺序
	@Bean(initMethod="initMethod", destroyMethod="destroyMethod")
	public InitBeanAndDestroyBean initBeanAndDestroyBean() {
		return new InitBeanAndDestroyBean();
	}
}

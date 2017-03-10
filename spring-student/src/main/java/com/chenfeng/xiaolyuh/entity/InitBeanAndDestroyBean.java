package com.chenfeng.xiaolyuh.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Spring 容器中的 Bean 是有生命周期的，spring 允许 Bean 在初始化完成后以及销毁前执行特定的操作。
 * 下面是常用的三种指定特定操作的方法：
 * 
 * 1、通过实现InitializingBean/DisposableBean 接口来定制初始化之后/销毁之前的操作方法； 通过<bean> 元素的
 * 2、init-method/destroy-method属性指定初始化之后 /销毁之前调用的操作方法；
 * 3、在指定方法上加上@PostConstruct或@PreDestroy注解来制定该方法是在初始化之后还是销毁之前调用。
 * 
 * 这几种配置方式，执行顺序是怎样的呢？我们通过例子来研究下：
 * 
 * 从执行结果可以看出： 
 * Bean在实例化的过程中：Constructor > @PostConstruct >InitializingBean > init-method
 * Bean在销毁的过程中：@PreDestroy > DisposableBean > destroy-method
 */
public class InitBeanAndDestroyBean implements InitializingBean, DisposableBean {
	public String say() {
		return "Hello!" + this.getClass().getName();
	}

	public InitBeanAndDestroyBean() {
		System.out.println("执行InitBeanAndDestroyBean构造方法");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("接口-执行InitBeanAndDestroyBeanTest：destroy方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("接口-执行InitBeanAndDestroyBeanTest：afterPropertiesSet方法");
	}

	@PostConstruct
	public void postConstructstroy() {
		System.out.println("注解-执行InitBeanAndDestroyBeanTest：preDestroy方法");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("注解--执行InitBeanAndDestroyBeanTest：preDestroy方法");
	}

	public void initMethod() {
		System.out.println("XML配置-执行InitBeanAndDestroyBeanTest：init-method方法");
	}

	public void destroyMethod() {
		System.out.println("XML配置-执行InitBeanAndDestroyBeanTest：destroy-method方法");
	}
}

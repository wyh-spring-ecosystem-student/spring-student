package com.chenfeng.xiaolyuh.aware.service;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Spring Aware的目的是让Bean获得Spring的容器服务，主要接口是：
 * BeanNameAware: 获取容器中Bean的名称
 * BeanFactoryAware：获得当前Bean Factory，这样可以调用容器的服务
 * ApplicationContextAware：获得当前Application Context，这样可以获得容器的服务
 * MessageSourceAware：获得Message Source，这样可以获得文本信息
 * ApplicationEventPublisherAware：应用事件发布器，可以发布事件。再DemoPublisher中也可以实现这个接口来发布事件
 * ResourceLoaderAware： 获得资源加载器，可以获得外部资源
 */
@Service
// 实现BeanNameAware、ResourceLoaderAware接口，获得Bean的名称和资源加载服务。
public class DemoAwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanBane;
	
	private ResourceLoader resourceLoader; 
	
	@Override
	// 实现ResourceLoaderAware接口需要重写setResourceLoader方法
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	// 实现BeanNameAware接口需要重写setBeanName方法
	public void setBeanName(String beanBane) {
		this.beanBane = beanBane;
	}
	
	@Override
	public String toString() {
		String output = "";
		Resource resource = resourceLoader.getResource("classpath:aware/test.txt");
		try {
			output = "ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream());
		} catch (IOException e) {
		}
		return output + " Bean的名字为：" + beanBane;
	}
}

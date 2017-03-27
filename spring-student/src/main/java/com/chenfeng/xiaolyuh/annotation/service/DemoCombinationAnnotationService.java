package com.chenfeng.xiaolyuh.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class DemoCombinationAnnotationService {
	
	public void outputResult() {
		System.out.println("从组合注解配置Bean照样获得Bean");
	}
}

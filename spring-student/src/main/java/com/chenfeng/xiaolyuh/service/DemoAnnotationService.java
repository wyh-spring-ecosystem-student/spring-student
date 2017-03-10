package com.chenfeng.xiaolyuh.service;

import org.springframework.stereotype.Service;

import com.chenfeng.xiaolyuh.annotation.Action;

/**
 * 编写使用注解的被拦截类
 * @ClassName DemoAnnotationService
 * @author yuhao.wang
 * @Date 2017年3月10日 下午3:41:18
 * @version 1.0.0
 */
@Service
public class DemoAnnotationService {
	
	@Action(name="编写使用注解的被拦截类")
	public void add() {
		System.out.println("写使用注解的被拦截类DemoAnnotationService:add");
	}
}

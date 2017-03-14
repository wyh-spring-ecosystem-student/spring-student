package com.chenfeng.xiaolyuh.aop.service;

import org.springframework.stereotype.Service;

/**
 * 编写使用方法规则被拦截类
 * @ClassName DemoMethodService
 * @author yuhao.wang
 * @Date 2017年3月10日 下午3:41:18
 * @version 1.0.0
 */
@Service
public class DemoAOPMethodService {
	
	public void add() {
		System.out.println("使用方法规则被拦截类DemoMethodService:add");
	}
}

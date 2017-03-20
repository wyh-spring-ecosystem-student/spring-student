package com.chenfeng.xiaolyuh.conditional.service.impl;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import com.chenfeng.xiaolyuh.conditional.condition.WindowsCondition;
import com.chenfeng.xiaolyuh.conditional.service.ListService;

@Service
@Conditional(WindowsCondition.class)// 使用@Conditional注解，符合Windows条件就实例化WindowsListService
public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		
		return "dir";
	}

}

package com.chenfeng.xiaolyuh.conditional.service.impl;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import com.chenfeng.xiaolyuh.conditional.condition.LinuxCondition;
import com.chenfeng.xiaolyuh.conditional.service.ListService;

@Service
@Conditional(LinuxCondition.class)// 使用@Conditional注解，符合Linux条件就实例化LinuxListService
public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		
		return "ls";
	}

}

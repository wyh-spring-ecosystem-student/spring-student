package com.chenfeng.xiaolyuh.conditional.service.impl;

import com.chenfeng.xiaolyuh.conditional.service.ListService;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		
		return "ls";
	}

}
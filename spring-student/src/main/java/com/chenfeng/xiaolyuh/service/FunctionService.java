package com.chenfeng.xiaolyuh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenfeng.xiaolyuh.entity.FunctionEntity;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
@Service
public class FunctionService {
	
	@Autowired
	private FunctionEntity functionEntity;

    public String sayHello() {
        return functionEntity.sayHello();
    }
}

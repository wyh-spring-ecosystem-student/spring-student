package com.chenfeng.xiaolyuh.el.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * EL的测试类
 * @ClassName DemoELService
 * @author yuhao.wang
 * @Date 2017年3月10日 下午3:41:18
 * @version 1.0.0
 */
@Service
public class DemoELService {
	
	@Value("EL的测试类")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}
}

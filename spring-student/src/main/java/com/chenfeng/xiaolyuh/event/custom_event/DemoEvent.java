package com.chenfeng.xiaolyuh.event.custom_event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @ClassName DemoEvent
 * @Description 自定义事件
 * @author yuhao.wang
 * @Date 2017年3月14日 下午1:54:57
 * @version 1.0.0
 */
public class DemoEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

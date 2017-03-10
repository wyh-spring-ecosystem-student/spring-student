package com.chenfeng.xiaolyuh.entity;

import org.springframework.stereotype.Component;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
@Component
public class FunctionEntity {
    public String sayHello() {
        return "Hello!" + this.getClass().getName();
    }
}

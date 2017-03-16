package com.chenfeng.xiaolyuh.test;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chenfeng.xiaolyuh.bean.config.BeanConfig;
import com.chenfeng.xiaolyuh.bean.entity.CatEntity;
import com.chenfeng.xiaolyuh.bean.entity.DogEntity;
import com.chenfeng.xiaolyuh.bean.entity.InitBeanAndDestroyBean;
import com.chenfeng.xiaolyuh.bean.service.FunctionService;

/**
 * Created by yuhao.wang on 2017/3/9.
 */
public class SpringBeanTest {
	// 使用容器
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class, CatEntity.class);

    @Test
    public void contextTest() {
    	// 从容器中获取Bean
    	// 声明bean方式1-注解
    	FunctionService functionSercice = context.getBean(FunctionService.class);
    	System.out.println(functionSercice.sayHello());
    	System.out.println(context.getBeansOfType(FunctionService.class));
    	// 声明bean方式2-再配置类中加Bean注解
    	System.out.println(context.getBean(DogEntity.class));
    	// 声明bean方式3-直接在容器初始化时传入
    	System.out.println(context.getBean(CatEntity.class));
    	
    	// 根据名字获取bean
    	System.out.println(context.getBean("getDogEntity"));

    	// 测试Bean的三种初始化、销毁方式和执行顺序
    	System.out.println(context.getBean(InitBeanAndDestroyBean.class));
    }
    
    @After
    public void closeContext() {
    	context.close();
    }

}

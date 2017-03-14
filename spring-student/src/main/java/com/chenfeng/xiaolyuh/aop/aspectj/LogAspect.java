package com.chenfeng.xiaolyuh.aop.aspectj;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.chenfeng.xiaolyuh.aop.annotation.Action;

/**
 * 编写切面
 * @ClassName LogAspect
 * @author yuhao.wang
 * @Date 2017年3月10日 下午3:46:11
 * @version 1.0.0
 */
@Aspect// 通过@Aspect声明一个切面
@Component // 通过@Component让此切面成为Spring容器管理的Bean
public class LogAspect {
	// 通过@Pointcut注解声明一个切点
	@Pointcut("@annotation(com.chenfeng.xiaolyuh.aop.annotation.Action)") 
	public void annotationPointCut(){};
	
	// 通过@After注解声明一个建言，并使用@Pointcut定义的切点
	@After("annotationPointCut()") 
	public void after(JoinPoint joinPoint) {
		// 通过反射可以获得注解上的属性，然后做日志记录相关的操作
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截器：" + action.name());
	}
	
	// 通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
	@Before("execution(* com.chenfeng.xiaolyuh.aop.service.DemoAOPMethodService.*(..))")
	public void before(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("拦截规则式拦截器：" + method.getName());
	}
}

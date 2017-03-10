package com.chenfeng.xiaolyuh.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 拦截规则注解
 * 注解本生没有功能，就和XML一样。注解和XML都是一种元数据，元数据即解释数据的数据，这就是所谓的配置。
 * 注解的功能来自用这个注解的地方。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

	String name();
}

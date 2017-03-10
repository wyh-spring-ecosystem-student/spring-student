# spring-student
Spring学习实例

## 使用容器AnnotationConfigApplicationContext
初始化容器是需要传入一个配置类（包含@Configuration注解的类）

## 配置类
<code>
@Configuration // 声明成配置文件
@ComponentScan("com.chenfeng.xiaolyuh") // 扫描包
public class MyConfig {
	
	@Bean // 声明成一个begin，名字默认是方法名
	public DogEntity getDogEntity() {
		return new DogEntity();
	}

	// 测试Bean的几种初始化和销毁方式，和执行顺序
	@Bean(initMethod="initMethod", destroyMethod="destroyMethod")
	public InitBeanAndDestroyBean initBeanAndDestroyBean() {
		return new InitBeanAndDestroyBean();
	}
}
<code>

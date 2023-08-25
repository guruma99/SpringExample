package kr.top2blue.Hello.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.top2blue.Hello.config.HelloWorldConfig;
import kr.top2blue.Hello.vo.HelloWorld;

public class MainApp {
	public static void main(String[] args) {
		// 스프링을 이용하여 객체를 찾아서 사용하겠다.
		// 1. 스프링의 컨텍스트 객체를 얻어야 한다.
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		// 2. 스프링에서 필요한 객체를 읽어서(찾아서) 사용한다.
		HelloWorld helloWorld = context.getBean("hello", HelloWorld.class);
		System.out.println(helloWorld.sayHello("한사람"));
		System.out.println(helloWorld.sayHello("두사람"));
		System.out.println(helloWorld.sayHello("세사람"));

		
		// 3. 마무리(닫기)
		context.close();
	}
}

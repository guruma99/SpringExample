package kr.human.core.hello.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.core.hello.vo.HelloWorld;

public class AppMain03 {
	public static void main(String[] args) {
		// 환경 설정 파일을 읽어서 컨텓스트 객체를 생성합니다
		// 컨텍스트 : 이 애플리케이션의 모든 정보를 가지는 스프링 컨테이너
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("AppConfig.xml");
		
		// 객체의 사용. 이미 모든 객체는 스프링 컨테이너에 만들어져 있으므로 
		// 찾아서 사용하면 된다.
		HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
		helloWorld1.sayHello("한사람");
		System.out.println(helloWorld1.hashCode());
		
		HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
		helloWorld2.sayHello("두사람");
		System.out.println(helloWorld2.hashCode());
		// 해시코드가 같다. 같은 객체다. 스프링이 알아서 싱글톤으로 관리해준다.
		
		context.close();
	}
}

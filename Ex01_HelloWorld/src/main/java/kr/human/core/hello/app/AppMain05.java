package kr.human.core.hello.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.core.hello.vo.Greeter;

public class AppMain05 {
	public static void main(String[] args) {
		// 환경 설정 파일을 읽어서 컨텓스트 객체를 생성합니다
		// 컨텍스트 : 이 애플리케이션의 모든 정보를 가지는 스프링 컨테이너
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("AppConfig2.xml");
		
		// 객체의 사용. 이미 모든 객체는 스프링 컨테이너에 만들어져 있으므로 
		// 찾아서 사용하면 된다.
		Greeter greeter = context.getBean("greeter", Greeter.class);
		System.out.println(greeter.greet("한사람"));
		greeter.setFormat("%s님 방가방가!!!");
		System.out.println(greeter.greet("두사람"));
		greeter.setFormat("%s님 환영합니다.");
		System.out.println(greeter.greet("세사람"));
		
		context.close();
	}
}

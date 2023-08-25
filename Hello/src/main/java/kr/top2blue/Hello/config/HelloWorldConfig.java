package kr.top2blue.Hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.top2blue.Hello.vo.HelloWorld;
import kr.top2blue.Hello.vo.HelloWorldImpl;

@Configuration // 나는 스프링에 객체를 등록하는 환경설정 클래스이다.
public class HelloWorldConfig {
	
	// 프로그램에서 사용할 객체들을 스프링 컨테이너에게 등록한다.
	@Bean(name = "hello") // HelloWorldImpl객체를 hello라는 이름으로 등록해라.
	public HelloWorld getHelloWorld() {
		return new HelloWorldImpl();
	}

}

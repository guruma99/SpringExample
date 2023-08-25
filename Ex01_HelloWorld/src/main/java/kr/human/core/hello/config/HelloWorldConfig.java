package kr.human.core.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.core.hello.vo.HelloWorld;
import kr.human.core.hello.vo.HelloWorldImpl;

@Configuration // 이 클래스를 환경 설정 파일로 사용하겠다.
public class HelloWorldConfig {

	// 내가 만든 객체를 스프링 프레임워크에게 등록해준다.
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
}

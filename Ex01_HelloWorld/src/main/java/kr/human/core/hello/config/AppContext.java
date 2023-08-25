package kr.human.core.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.core.hello.vo.Greeter;

@Configuration
public class AppContext {
	
	// 객체등록
	@Bean // name 생략시 메서드명이 된다.
	public Greeter greeter() {
		Greeter greeter = new Greeter();
		greeter.setFormat("[%-10s]님 안녕하세요");
		return greeter;
	}
}

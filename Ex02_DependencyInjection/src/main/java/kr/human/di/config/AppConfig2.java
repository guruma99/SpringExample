package kr.human.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.service.Communication2;
import kr.human.di.vo.Encryption;
import kr.human.di.vo.MD5Encryption;
import kr.human.di.vo.RSAEncryption;

@Configuration // 이 클래스는 설정 파일이다. 
public class AppConfig2 {
	
	@Bean
	public Encryption encryption() {
		return new MD5Encryption();
	}
	
	
	@Bean
	public Communication2 communication1() {
		Communication2 communication = new Communication2(encryption()); // 생성자로 주입
		return communication;
	}
	
	@Bean
	public Communication2 communication2() {
		Communication2 communication = new Communication2(encryption()); // 생성자로 주입
		return communication;
	}
	
	@Bean
	public Communication2 communication3() {
		Communication2 communication = new Communication2(new RSAEncryption()); // 생성자로 주입
		return communication;
	}
	
}

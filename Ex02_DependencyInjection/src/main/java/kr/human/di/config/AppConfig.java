package kr.human.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.service.Communication;
import kr.human.di.vo.ActiveMQMessaging;
import kr.human.di.vo.MMSMessaging;
import kr.human.di.vo.Messaging;
import kr.human.di.vo.SMSMessaging;

@Configuration // 이 클래스는 설정 파일이다. 
public class AppConfig {
	
	@Bean
	public Messaging messaging1() {
		return new ActiveMQMessaging();
	}
	@Bean
	public Messaging messaging2() {
		return new MMSMessaging();
	}
	
	@Bean
	public Communication communication1() {
		Communication communication = new Communication();
		communication.setMessaging(messaging1());
		return communication;
	}
	@Bean
	public Communication communication2() {
		Communication communication = new Communication();
		communication.setMessaging(messaging2());
		return communication;
	}
	@Bean
	public Communication communication3() {
		Communication communication = new Communication();
		communication.setMessaging(new SMSMessaging());
		return communication;
	}
}

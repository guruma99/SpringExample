package kr.top2blue.DI1.config;

import org.springframework.context.annotation.Bean;

import kr.top2blue.DI1.service.Communication;
import kr.top2blue.DI1.vo.EmailMessaging;
import kr.top2blue.DI1.vo.MMSMessaging;
import kr.top2blue.DI1.vo.Messaging;
import kr.top2blue.DI1.vo.SMSMessaging;

public class MessagingConfig {
	@Bean(name = "smsMessaging")
	public Messaging smsMessaging() {
		return new SMSMessaging();
	}

	@Bean // 이름을 생략하면 메서드명이 된다.
	public Messaging mmsMessaging() {
		return new MMSMessaging();
	}

	@Bean // 필요한 Messaging 객체를 주입하지 않으면 NullPointer Exception 발생
	public Communication communication1() {
		return new Communication();
	}

	// 필요한 객체를 넣어주는 두가지 방법이 있다.
	// 1. setter를 통한 주입
	public Communication communication2() {
		Communication communication = new Communication();
		communication.setMessaging(smsMessaging()); //setter를 통한 필요객체 주입
		return communication;

	}

	// 2. 생성자를 통한 주입
		@Bean 
		public Communication communication3() {
			// 생성자를 통한 주입
			Communication communication = new Communication(mmsMessaging());
			return communication;
		}

	// 필요한 객체를 등록하는 코드가 없다면 직접 객체를 생성해서 주입해도 된다.
	@Bean
	public Communication communication4() {
		Communication communication = new Communication(new EmailMessaging());
		return communication;
	}
}

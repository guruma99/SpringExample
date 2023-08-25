package kr.human.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.app.MyApplication2;
import kr.human.di.service.EmailService;
import kr.human.di.service.TwitterService;

@Configuration
public class AppConfig2 {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}

	@Bean
	public TwitterService twitterService() {
		return new TwitterService();
	}
	
	@Bean
	public MyApplication2 myApplication1() {
		MyApplication2 myApplication = new MyApplication2();
		myApplication.setService1(emailService());
		myApplication.setService2(twitterService());
		return myApplication;
	}

	@Bean
	public MyApplication2 myApplication2() {
		MyApplication2 myApplication = new MyApplication2(emailService(), twitterService());
		return myApplication;
	}
}

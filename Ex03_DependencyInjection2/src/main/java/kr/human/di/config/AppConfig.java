package kr.human.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.app.MyApplication;
import kr.human.di.service.EmailService;
import kr.human.di.service.TwitterService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}

	@Bean
	public TwitterService twitterService() {
		return new TwitterService();
	}
	
	
	@Bean
	public MyApplication myApplication1() {
		MyApplication myApplication = new MyApplication();
		myApplication.setService(emailService());
		return myApplication;
	}

	@Bean
	public MyApplication myApplication2() {
		MyApplication myApplication = new MyApplication(twitterService());
		return myApplication;
	}
}

package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.service.Communication3;

public class AppMain06 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("AppConfig3.xml");
		
		Communication3 communication = context.getBean("communication", Communication3.class );
		communication.communicate();
		
		context.close();
	}
}

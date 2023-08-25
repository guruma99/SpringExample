package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.AppConfig;
import kr.human.di.service.Communication;

public class AppMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Communication communication1 = context.getBean("communication1", Communication.class );
		Communication communication1 = (Communication) context.getBean("communication1"); // 옛날 방식
		communication1.communicate();
		
		Communication communication2 = context.getBean("communication2", Communication.class );
		communication2.communicate();
		
		Communication communication3 = context.getBean("communication3", Communication.class );
		communication3.communicate();
		
		context.close();
	}
}

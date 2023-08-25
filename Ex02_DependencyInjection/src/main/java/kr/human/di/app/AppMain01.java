package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.service.Communication;

public class AppMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("AppConfig.xml");
		
		Communication communication1 = context.getBean("communication1", Communication.class );
		communication1.communicate();
		
		Communication communication2 = context.getBean("communication2", Communication.class );
		communication2.communicate();
		
		Communication communication3 = context.getBean("communication3", Communication.class );
		communication3.communicate();
		
		context.close();
	}
}

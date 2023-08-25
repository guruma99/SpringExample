package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.AppConfig2;
import kr.human.di.service.Communication2;

public class AppMain05 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig2.class);
		
		Communication2 communication1 = context.getBean("communication1", Communication2.class );
		communication1.communicate();
		
		Communication2 communication2 = context.getBean("communication2", Communication2.class );
		communication2.communicate();
		
		Communication2 communication3 = context.getBean("communication3", Communication2.class );
		communication3.communicate();
		
		context.close();
	}
}

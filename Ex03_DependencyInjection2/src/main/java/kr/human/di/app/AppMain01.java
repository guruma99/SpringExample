package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.AppConfig;

public class AppMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		MyApplication myApplication1 = context.getBean("myApplication1", MyApplication.class);
		myApplication1.processMessage("[방가방가!!!!]", "kkkk@kkk.com");
		
		MyApplication myApplication2 = context.getBean("myApplication2", MyApplication.class);
		myApplication2.processMessage("[반갑습니다. 놀러오세요!!!!]", "kkkk@kkk.com");
		
		context.close();
	}
}

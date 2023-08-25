package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.AppConfig2;

public class AppMain03 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig2.class);
		
		MyApplication2 myApplication1 = context.getBean("myApplication1", MyApplication2.class);
		myApplication1.processMessage("[방가방가!!!!]", "kkkk@kkk.com");
		
		MyApplication2 myApplication2 = context.getBean("myApplication2", MyApplication2.class);
		myApplication2.processMessage("[반갑습니다. 놀러오세요!!!!]", "kkkk@kkk.com");
		
		context.close();
	}
}

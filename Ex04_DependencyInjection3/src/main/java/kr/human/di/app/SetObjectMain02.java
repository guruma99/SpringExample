package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.SetObjectConfig;
import kr.human.di.vo.SetObject;

public class SetObjectMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(SetObjectConfig.class);
		
		// 생성자로 Set을 주입한 객체 테스트
		SetObject setObject1 = context.getBean("setObject1", SetObject.class);
		System.out.println(setObject1);
		
		// Setter로 Set을 주입한 객체 테스트
		SetObject setObject2 = context.getBean("setObject2", SetObject.class);
		System.out.println(setObject2);
		
		context.close();
	}
}

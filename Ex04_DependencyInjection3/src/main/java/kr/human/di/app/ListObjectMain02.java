package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.ListObjectConfig;
import kr.human.di.vo.ListObject;

public class ListObjectMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(ListObjectConfig.class);
		
		// 생성자로 List를  주입한 객체 테스트
		ListObject listObject1 = context.getBean("listObject1", ListObject.class);
		System.out.println(listObject1);
		
		// Setter로 LIst을 주입한 객체 테스트
		ListObject listObject2 = context.getBean("listObject2", ListObject.class);
		System.out.println(listObject2);
		
		context.close();
	}
}

package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.ArrayObject;

public class ArrayObjectMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("ArrayObject.xml");
		
		// 생성자로 배열을 주입한 객체 테스트
		ArrayObject arrayObject1 = context.getBean("arrayObject1", ArrayObject.class);
		System.out.println(arrayObject1);
		
		// Setter로 배열을 주입한 객체 테스트
		ArrayObject arrayObject2 = context.getBean("arrayObject2", ArrayObject.class);
		System.out.println(arrayObject2);
		
		context.close();
	}
}

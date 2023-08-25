package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.EmpVO;

public class EmpObjectMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Emp.xml");
		
		System.out.println(context.getBean("emp1", EmpVO.class)); // 1. 기본 생성자로 주입
		System.out.println(context.getBean("emp2", EmpVO.class)); // 2. 인수가 2개인 생성자를 통한 주입
		System.out.println(context.getBean("emp3", EmpVO.class)); // 2. 인수가 2개인 생성자를 통한 주입
		System.out.println(context.getBean("emp4", EmpVO.class)); 
		System.out.println(context.getBean("emp5", EmpVO.class)); 
		System.out.println(context.getBean("emp6", EmpVO.class)); // 3. Setter를 이용한 주입
		System.out.println(context.getBean("emp7", EmpVO.class)); 
		System.out.println(context.getBean("emp8", EmpVO.class)); //  4. 생성자와 Setter를 둘다 이용한 주입 
		System.out.println(context.getBean("emp9", EmpVO.class));
		context.close();
	}
}

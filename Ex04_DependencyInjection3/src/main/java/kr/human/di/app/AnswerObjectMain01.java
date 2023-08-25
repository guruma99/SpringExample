package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.AnswerVO;
import kr.human.di.vo.UserVO;

public class AnswerObjectMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Answer.xml");
		
		System.out.println(context.getBean("answer1", AnswerVO.class)); // 1. 기본 생성자로 주입
		System.out.println(context.getBean("user1", UserVO.class)); // 1. 기본 생성자로 주입
		System.out.println();
		System.out.println(context.getBean("answer2", AnswerVO.class)); // 2. 인수가 3개인 생성자를 통한 주입
		System.out.println(context.getBean("user2", UserVO.class));
		System.out.println();
		System.out.println(context.getBean("answer3", AnswerVO.class)); //  3. Setter를 이용한 주입 
		System.out.println(context.getBean("user3", UserVO.class));
		System.out.println();
		context.close();
	}
}

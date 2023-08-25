package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.QuestionVO;

public class QuestionVOMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("Question.xml");
		
		System.out.println(context.getBean("question1", QuestionVO.class));
		System.out.println();
		System.out.println(context.getBean("question2", QuestionVO.class));
		System.out.println();

		context.close();
	}
}

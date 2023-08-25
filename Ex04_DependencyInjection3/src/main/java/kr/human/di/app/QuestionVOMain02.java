package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.QuestionConfig;
import kr.human.di.vo.QuestionVO;

public class QuestionVOMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(QuestionConfig.class);
		
		System.out.println(context.getBean("question1", QuestionVO.class));
		System.out.println();
		System.out.println(context.getBean("question2", QuestionVO.class));
		System.out.println();

		context.close();
	}
}

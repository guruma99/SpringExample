package kr.top2blue.DI1.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.top2blue.DI1.config.MessagingConfig;
import kr.top2blue.DI1.service.Communication;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MessagingConfig.class);

		// 이 코드는 에러이다. 왜? 필요한 객체를 주입시지지 않았다.
//		Communication communication1 = context.getBean("communication1", Communication.class);

		// 대화
//		communication1.communicate();

		// 대화
		Communication communication2 = context.getBean("communication2", Communication.class);
		
		communication2.communicate(); //단문문자
		
		// 대화
		Communication communication3 = context.getBean("communication3", Communication.class);

		communication3.communicate(); //장문문자
		
		// 대화
		Communication communication4 = context.getBean("communication4", Communication.class);

		communication4.communicate();

		context.close();

	}

}

package kr.human.di.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.AppConfig;
import kr.human.di.vo.Application;
import kr.human.di.vo.Driver;
import kr.human.di.vo.Employee;
import kr.human.di.vo.Performer;

public class AppMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Application application = context.getBean("application", Application.class);
		System.out.println(application);
		System.out.println();
		
		System.out.println(context.getBean("employee", Employee.class));
		System.out.println();
		
		System.out.println(context.getBean("driver", Driver.class));
		System.out.println();
		
		System.out.println(context.getBean("performer", Performer.class));
		System.out.println();
		
		context.close();
	}
}

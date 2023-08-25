package kr.human.di.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.Application;
import kr.human.di.vo.Bond;
import kr.human.di.vo.Driver;
import kr.human.di.vo.Employee;
import kr.human.di.vo.Performer;

public class AppMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		
		Application application = context.getBean("application", Application.class);
		System.out.println(application);
		System.out.println();
		
		System.out.println(context.getBean("employee", Employee.class));
		System.out.println();
		
		System.out.println(context.getBean("driver", Driver.class));
		System.out.println();
		
		System.out.println(context.getBean("performer", Performer.class));
		System.out.println();
		// 이렇게만 하면 동일한 이름이 없으므로 동일한 타입으로 찾는데 동일한 타입이 2개 이상이라
		// 모호성이 발생하여 에러가 난다. 이때 어떤 차라고 반드시 지정해줘야 한다.
		Bond bond = context.getBean("bond", Bond.class);
		bond.showCar();
		
		context.close();
	}
}

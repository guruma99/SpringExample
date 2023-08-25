package kr.human.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.app.controller.EmployeeController;
import kr.human.app.vo.EmployeeVO;

public class AppMain3 {
	
	public static void main(String[] args) {
		// AppConfig.xml 파일이나 AppConfig.java 없이도 가능하다.
		// AbstractApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("kr.human.app"); // 탐색할 패키지 지정
		context.refresh(); // 이놈을 호출해야 위의 패키지를 검색해서 등록해 준다. 
		
		EmployeeVO vo = new EmployeeVO();
		vo.setId(1001);
		vo.setName("한사람");

		EmployeeController employeeController = context.getBean("employeeController", EmployeeController.class);
		employeeController.save(vo);
		
		context.close();
		
		
		/*
		 * Main은 Controller만
		 * Controller 는 Service만
		 * Service는 Dao만 호출할 줄 알면 된다.
		 * 
		 * 그래서 
		 * Main은 Controller를  @Autowired하고
		 * Controller 는 Service를  @Autowired하고
		 * Service는 Dao를  @Autowired만 하면 서로 연결되어 작동한다. 
		 */
	}
}

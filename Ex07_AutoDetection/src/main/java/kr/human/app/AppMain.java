package kr.human.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.app.config.AppConfig;
import kr.human.app.controller.EmployeeController;
import kr.human.app.vo.EmployeeVO;

public class AppMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeVO vo = new EmployeeVO();
		vo.setId(1001);
		vo.setName("한사람");
		
		// EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		// employeeService.registerEmployee(vo);
		
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

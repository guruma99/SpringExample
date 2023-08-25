package kr.human.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.human.app.service.EmployeeService;
import kr.human.app.vo.EmployeeVO;

@Controller // 컨트롤러 계열은 @Controller로 등록해라!!!
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public void save(EmployeeVO employeeVO ) {
		// 원래는 컨트롤러에서 request객체를 이용하여  EmployeeVO를 받아 서비스로 넘겨줘야 한다. 
		employeeService.registerEmployee(employeeVO);
	}
}

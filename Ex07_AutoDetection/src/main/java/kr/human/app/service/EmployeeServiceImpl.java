package kr.human.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.human.app.dao.EmployeeDao;
import kr.human.app.vo.EmployeeVO;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private DateService dateService;
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void registerEmployee(EmployeeVO employeeVO) {
		employeeVO.setAssessmentDate(dateService.getNextAssessmentDate()); // 날짜 넣고
		employeeDao.saveInDatabase(employeeVO); // DAO를 호출하여 저장을 수행하고
	}
}

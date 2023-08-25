package kr.human.app.dao;

import org.springframework.stereotype.Repository;

import kr.human.app.vo.EmployeeVO;

@Repository("employeeDao") // DAO 계열은 @Repository로 등록한다.
public class EmployeeDaoImpl implements EmployeeDao {
	@Override
	public void saveInDatabase(EmployeeVO employeeVO) {
		System.out.println(employeeVO + "저장합니다......");
	}
}

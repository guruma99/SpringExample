package kr.top2blue.jpa.service;

import java.util.List;

import kr.top2blue.jpa.vo.EmployeeVO;

public interface EmployeeService {
	List<EmployeeVO> selectList(); //모두 얻기
	EmployeeVO selectById(Long id);  // 아이디로 찾기
	EmployeeVO insert(EmployeeVO employeeVO); // 저장
	EmployeeVO update(EmployeeVO employeeVO); // 수정
	EmployeeVO delete(long id); // 삭제
	
	// findByDept --> 에서 D 이름의 첫스펠링 대문자 , 크거나같은지 같은지 적은지 영어로 선언하기.
	// 알아서 작동한다.
	List<EmployeeVO> findByDept(String deptName); //부서로 찾기
	List<EmployeeVO> findBySalaryGreaterThan(int salary); //연봉이상
	List<EmployeeVO> findByDeptAndSalaryLessThan(String deptName, int salary); //부서에서 연봉이하
}

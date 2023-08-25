package kr.top2blue.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.jpa.vo.EmployeeVO;

public interface EmployeeRepository extends CrudRepository<EmployeeVO, Long> {
	// 검색 조건 지정하기
	// findBy필드명조건[AND|OR]필드명조건 형태로 지정한다.
	List<EmployeeVO> findByDept(String deptName); //부서이름으로 찾기
	List<EmployeeVO> findByName(String Name); //이름으로 찾기
	List<EmployeeVO> findBySalaryGreaterThan(int salary); //연봉이 얼마 이상
	List<EmployeeVO> findByDeptAndSalaryLessThan(String deptName, int salary);
	List<EmployeeVO> findByDeptOrSalaryLessThan(String deptName, int salary);
}

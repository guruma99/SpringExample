package kr.top2blue.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.jpa.vo.Dept;
import kr.top2blue.jpa.vo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	// Dept로 찾기
	List<Employee> findByDept(Dept dept);
	// Dept id로 찾기
	List<Employee> findByDeptId(Long id);
	// Dept Name으로 찾기
	List<Employee> findByDeptName(String deptName);

}
package kr.top2blue.jpa.service;

import java.util.List;

import kr.top2blue.jpa.vo.Dept;
import kr.top2blue.jpa.vo.Employee;

public interface EmployeeService {
	List<Employee> selectEmployeeList();
	List<Dept> selectDeptList();
	List<Employee> findByDept(Dept dept);
	List<Employee> findByDeptId(Long id);
	List<Employee> findByDeptName(String deptName);
	void employeeSaveAll(List<Employee> list);
}

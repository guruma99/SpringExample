package kr.top2blue.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.top2blue.jpa.dao.DeptRepository;
import kr.top2blue.jpa.dao.EmployeeRepository;
import kr.top2blue.jpa.vo.Dept;
import kr.top2blue.jpa.vo.Employee;
import lombok.extern.slf4j.Slf4j;

@Service("employeeService")
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DeptRepository deptRepository;

	@Override
	public List<Employee> selectEmployeeList() {
		log.info("서비스 selectEmployeeList() 호출");
		List<Employee> list = new ArrayList<>();
		try {
			Iterable<Employee> it = employeeRepository.findAll();
			for (Employee vo : it)
				list.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 selectEmployeeList() 리턴 : {}", list);
		return list;
	}

	@Override
	public List<Dept> selectDeptList() {
		log.info("서비스 selectDeptList() 호출");
		List<Dept> list = new ArrayList<>();
		try {
			Iterable<Dept> it = deptRepository.findAll();
			for (Dept vo : it)
				list.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 selectDeptList() 리턴 : {}", list);
		return list;
	}
	// 여러개 저장
	@Override
	public void employeeSaveAll(List<Employee> list) {
		employeeRepository.saveAll(list);
	}
	// 부서로 찾기
	@Override
	public List<Employee> findByDept(Dept dept) {
		return employeeRepository.findByDept(dept);
	}
	// 부서 id로 찾기
	@Override
	public List<Employee> findByDeptId(Long id) {
		return employeeRepository.findByDeptId(id);
	}

	// 부서 Name으로 찾기
	@Override
	public List<Employee> findByDeptName(String deptName) {
		return employeeRepository.findByDeptName(deptName);
	}

}

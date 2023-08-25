package kr.top2blue.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.top2blue.jpa.service.EmployeeService;
import kr.top2blue.jpa.vo.EmployeeVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/emps")
public class APIController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/","/emps","/emps.xml"}, produces = MediaType.APPLICATION_XML_VALUE)
	public List<EmployeeVO> home1() throws Exception {
		log.info("목록보기");
		return employeeService.selectList();
	}
	@GetMapping(value = {"/emps.json"}, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeVO> home2() throws Exception {
		log.info("목록보기");
		return employeeService.selectList();
	}
	
	// GET 맵핑
	@GetMapping("/emps/{id}")
	EmployeeVO selectById(@PathVariable Long id){
		return employeeService.selectById(id);
	}
	// POST 맵핑
	@PostMapping("/emps")
	EmployeeVO insert(@RequestBody EmployeeVO employeeVO){
		return employeeService.insert(employeeVO);
	}
	// PUT  맵핑
	@PutMapping("/emps")
	EmployeeVO update(@RequestBody EmployeeVO employeeVO){
		return employeeService.update(employeeVO);
	}
	// DELETE 맵핑
	@DeleteMapping("/emps/{id}")
	EmployeeVO deletById(@PathVariable Long id){
		return employeeService.delete(id);
	}
}

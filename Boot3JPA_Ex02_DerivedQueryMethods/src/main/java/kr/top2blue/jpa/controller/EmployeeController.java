package kr.top2blue.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.top2blue.jpa.service.EmployeeService;
import kr.top2blue.jpa.vo.EmployeeVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/emp")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/","/list"})
	public String selectList(Model model){
		model.addAttribute("list", employeeService.selectList());
		return "emp/list";
	}
	// 부서별보기
	@GetMapping(value = "/deptList")
	//넘어오는거 받을 때 @RequestParam
	public String selectListDept(@RequestParam String deptName, Model model){
		model.addAttribute("list", employeeService.findByDept(deptName));
		return "emp/list";
	}
	// 이상연봉보기
	@GetMapping(value = "/salaryList")
	public String selectListSalary(@RequestParam int salary, Model model){
		model.addAttribute("list", employeeService.findBySalaryGreaterThan(salary));
		return "emp/list";
	}
	// 부서 이하 연봉보기
	@GetMapping(value = "/deptSalaryList")
	public String selectListDeptSalary(@RequestParam String deptName, @RequestParam int salary, Model model){
		model.addAttribute("list", employeeService.findByDeptAndSalaryLessThan(deptName,salary));
		return "emp/list";
	}
	
	@GetMapping(value = "/insertOk")
	public String insertOkGet(@ModelAttribute EmployeeVO employeeVO){
		return "redirect:/emp/";
	}
	
	@PostMapping(value = "/insertOk")
	public String insertOkPost(@ModelAttribute EmployeeVO employeeVO){
		if(employeeVO!=null) {
			employeeService.insert(employeeVO);
		}
		return "redirect:/emp/";
	}
	
	@GetMapping(value = "/updateOk")
	public String updateOkGet(@ModelAttribute EmployeeVO employeeVO){
		return "redirect:/emp/";
	}
	
	@PostMapping(value = "/updateOk")
	public String updateOkPost(@ModelAttribute EmployeeVO employeeVO){
		if(employeeVO!=null) {
			EmployeeVO vo = employeeService.selectById(employeeVO.getId());
			if(vo!=null) {
				employeeService.update(employeeVO);
				log.info("수정성공 : {}", employeeVO);
			}
		}
		return "redirect:/emp/";
	}
	
	@GetMapping(value = "/deleteOk")
	public String deleteOkGet(@RequestParam(required = false, defaultValue = "-1") long id){
		EmployeeVO vo = employeeService.selectById(id);
		if(vo!=null) {
			employeeService.delete(vo.getId());
			log.info("삭제 성공 : {}", vo);
		}
		return "redirect:/emp/";
	}
	
}

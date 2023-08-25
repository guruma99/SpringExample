package kr.top2blue.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.top2blue.jpa.service.EmployeeService;
import kr.top2blue.jpa.vo.Dept;

@Controller
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value = {"/","/list"})
	public String selectList(Model model){
		model.addAttribute("empList", employeeService.selectEmployeeList());
		model.addAttribute("deptList", employeeService.selectDeptList());
		return "emp/list";
	}
	// 부서별 보기
	@GetMapping(value = "/deptList")
	public String selectList(@ModelAttribute Dept dept, Model model){
		model.addAttribute("empList", employeeService.findByDept(dept));
		model.addAttribute("deptList", employeeService.selectDeptList());
		return "emp/list";
	}
	// 부서 이름별 보기
	@GetMapping(value = "/deptIdList")
	public String selectListId(@RequestParam Long id, Model model){
		model.addAttribute("empList", employeeService.findByDeptId(id));
		model.addAttribute("deptList", employeeService.selectDeptList());
		return "emp/list";
	}
	// 부서 이름별 보기
	@GetMapping(value = "/deptNameList")
	public String selectListDept(@RequestParam String deptName, Model model){
		model.addAttribute("empList", employeeService.findByDeptName(deptName));
		model.addAttribute("deptList", employeeService.selectDeptList());
		return "emp/list";
	}
}

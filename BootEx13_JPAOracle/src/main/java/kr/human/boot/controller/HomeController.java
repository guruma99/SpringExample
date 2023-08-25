package kr.human.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.human.boot.service.HomeService;
import kr.human.boot.service.StudentService;
import kr.human.boot.vo.Student;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@Autowired
	HomeService homeService;

	@Autowired
	StudentService studentService;
	
	@GetMapping(value = "/")
	public String getToday(Model model) {
		model.addAttribute("serverTime", homeService.getToday());
		return "index";
	}

	@GetMapping(value = "/list")
	public String selectList(Model model) {
		model.addAttribute("list", studentService.selectAll());
		return "list";
	}
	@GetMapping(value = "/insertOk")
	public String insertOkGet(Model model) {
		return "redirect:/list";
	}
	@PostMapping(value = "/insertOk")
	public String insertOkPost(@ModelAttribute Student student, Model model) {
		Student student2 = studentService.insert(student);
		log.info(student2 + " 저장완료!!!");
		return "redirect:/list";
	}
}

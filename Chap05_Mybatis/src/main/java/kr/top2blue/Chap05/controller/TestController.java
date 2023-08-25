package kr.top2blue.Chap05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.top2blue.Chap05.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return testService.getToday();
	}
	
	//밑의 주석을 복사하여 주소창에 localhost:8080/뒤에 입력하기
	//sum?n1=234&n2=345
	@GetMapping("/sum")
	@ResponseBody
	public int getSum(@RequestParam(defaultValue = "0")int n1,@RequestParam(defaultValue = "0")int n2) {
		return testService.getSum(n1, n2);
	}
	
}

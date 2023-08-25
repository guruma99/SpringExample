package kr.top2blue.memo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api") //이 컨트롤러에서 만드는 모든 주소 앞에 /api가 붙는다.
public class MyRestController {

	@GetMapping(value= {"/","/hello"})
	public String hello(@RequestParam(defaultValue = "한사람") String name) {
		return  name + "님 반갑습니다.";
	}
	
	@PostMapping(value= {"/hello2"})
	public String hello2(@RequestParam(defaultValue = "한사람") String name) {
		return  name + "님 반갑습니다.";
	}
	//http://localhost:8080/api/hello2?name=%EC%9D%B4%EC%9D%B8%EA%B0%84 이렇게 검색하면 Get방식이기 때문에 문서 뜨지않는다.
	//Post방식은 html이 있어야한다.
}

// axios 는 네가지 다 지원. put delete post get 방식 모두..
// 교재에서는 postman이라는거 설치해서 사용한다. 
// 근데 교재방식보다 swagger-ui 디펜던시에 추가해서 쓰는게 편함!  ==> /swagger-ui/index.html 여기서 테스트!

//http://localhost:8080/api/hello?name=%EC%9D%B4%EC%9D%B8%EA%B0%84
//http://localhost:8080/api/hello
//이런식으로 주소창에 직접 입력하여 확인을 하였다면 (불편함),,
//디펜던시에 한줄추가하고 swagger-ui/index.html로 주소창에 검색하면 확인이 쉽다.
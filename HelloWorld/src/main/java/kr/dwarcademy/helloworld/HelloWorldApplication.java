package kr.dwarcademy.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	//인터넷 상의 주소를 생성한다.
	@GetMapping(value = {"/", "/hello","/hello/it"})
	public String helloWorld() {
		return "Hello 여치!!!";
	}
}

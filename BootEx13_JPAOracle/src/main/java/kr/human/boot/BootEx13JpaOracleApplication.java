package kr.human.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootEx13JpaOracleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootEx13JpaOracleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-".repeat(80));
		System.out.println("http://localhost:8080 으로 접속해주세요");
		System.out.println("-".repeat(80));
	}
	/*
	@Bean // Spring Boot Application이 시작될때 자동으로 실행되는 메서드
	public CommandLineRunner commandLineRunner(StudentService studentService) {
		return (args) -> {
			studentService.insert(new Student("한", "사람", "자바"));
			studentService.insert(new Student("두", "인간", "Boot"));
			studentService.insert(new Student("한", "세상", "JPA"));
			
			List<Student> list = studentService.selectAll();
			System.out.println(list.size() + "개 있음!!!");
			for(Student vo : list) System.out.println(vo);
		};
	}
	*/
}

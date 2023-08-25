package kr.top2blue.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import kr.top2blue.jpa.service.EmployeeService;
import kr.top2blue.jpa.vo.Dept;
import kr.top2blue.jpa.vo.Employee;

@SpringBootApplication
public class Boot3JpaEx03NestedPropertiesResolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot3JpaEx03NestedPropertiesResolutionApplication.class, args);
	}

	@Bean // Spring Boot Application이 시작될때 자동으로 실행되는 메서드
	public CommandLineRunner commandLineRunner(EmployeeService service) {
		return (args) -> {
			Dept admin = new Dept("Admin");
			Dept it = new Dept("IT");
			Dept sale = new Dept("Sale");
			List<Employee> list = new ArrayList<>();
			list.add(new Employee("한사람", admin, 50000000));
			list.add(new Employee("두사람", it, 43000000));
			list.add(new Employee("세사람", sale, 47000000));
			list.add(new Employee("네사람", it, 38000000));
			list.add(new Employee("오사람", it, 41000000));
			list.add(new Employee("육사람", sale, 49000000));
			// 자동으로 Dept테이블에도 저장됨
			service.employeeSaveAll(list);
		};
	}
}

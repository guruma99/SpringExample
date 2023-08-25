package kr.top2blue.jpa;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import kr.top2blue.jpa.service.EmployeeService;
import kr.top2blue.jpa.vo.EmployeeVO;

@SpringBootApplication
public class Boot3JpaEx02DerivedQueryMethodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot3JpaEx02DerivedQueryMethodsApplication.class, args);
	}
	@Bean // Spring Boot Application이 시작될때 자동으로 실행되는 메서드
	public CommandLineRunner commandLineRunner(EmployeeService service) {
		return (args) -> {
			service.insert(new EmployeeVO("한사람","총무",3400_0000));
			service.insert(new EmployeeVO("두사람","인사",3900_0000));
			service.insert(new EmployeeVO("세사람","인사",2800_0000));
			service.insert(new EmployeeVO("네사람","기획",4100_0000));
			service.insert(new EmployeeVO("오사람","총무",3600_0000));
			service.insert(new EmployeeVO("육사람","인사",4500_0000));
			service.insert(new EmployeeVO("칠사람","인사",3100_0000));
			service.insert(new EmployeeVO("팔사람","기획",5200_0000));
			
			List<EmployeeVO> list = service.selectList();
			System.out.println(list.size() + "개 있음!!!");
			for(EmployeeVO vo : list) System.out.println(vo);
		};
	}
}

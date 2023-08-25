package kr.human.di.vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component // 스프링에 객체 등록
public class Employee {
	@Autowired // 자동 주입
    private EmployeeAddress employeeAddress;
}

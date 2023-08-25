package kr.human.di.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component // 이름을 생략하면 클래스 이름의 첫글자가 소문자로 바뀐 이름으로 등록된다.
public class EmployeeAddress {
    private String street="한강로 21";
    private String city="서울 영등포구";
}

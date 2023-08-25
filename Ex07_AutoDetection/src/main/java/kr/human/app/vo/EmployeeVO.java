package kr.human.app.vo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// VO는 특별한 경우가 아니면 스프링에 등록하지 않는다.
// 왜? VO는 데이터를 전달하기 위한 용도의 값만을 저장하는 객체이다.
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeVO {
    private int id;
    private String name;
    private LocalDate assessmentDate;
}

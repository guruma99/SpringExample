package kr.human.di.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component(value = "applicationUser")   // 자동으로 객체를 등록해라
public class ApplicationUser {
    private String name="최고관리자";
}
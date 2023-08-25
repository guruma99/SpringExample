package kr.human.di.vo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component(value = "application") // 자동으로 객체를 등록해라
public class Application {
	@Resource(name = "applicationUser") // 등록된 객체에서 찾아서 대입해라(javax.annotation이용)
	@Autowired // 등록된 객체에서 찾아서 대입해라(Spring 기능 사용)
    private ApplicationUser applicationUser;
}
package kr.human.di.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.vo.ListObject;

@Configuration
public class ListObjectConfig {

	@Bean // 생성자를 통한 주입
	public ListObject listObject1() {
		ListObject listObject = new ListObject(Arrays.asList("한놈","두식이"));
		return listObject;
	}
	@Bean // Setter를 통한 주입
	public ListObject listObject2() {
		ListObject listObject = new ListObject();
		listObject.setList(Arrays.asList("한놈","두식이","한놈","두식이"));
		return listObject;
	}
}

package kr.human.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.vo.ArrayObject;

@Configuration
public class ArrayObjectConfig {

	@Bean // 생성자를 통한 주입
	public ArrayObject arrayObject1() {
		ArrayObject arrayObject = new ArrayObject(new int[] {1,2,3}, "한놈,두식이, 석삼".split(","));
		return arrayObject;
	}
	@Bean // Setter를 통한 주입
	public ArrayObject arrayObject2() {
		ArrayObject arrayObject = new ArrayObject();
		arrayObject.setIds(new int[] {1, 2, 3, 4, 5});
		arrayObject.setNames("한놈,두식이,석삼,너구리,오징어".split(","));
		return arrayObject;
	}
}

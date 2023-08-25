package kr.human.di.config;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.vo.SetObject;

@Configuration
public class SetObjectConfig {

	@Bean // 생성자를 통한 주입
	public SetObject setObject1() {
		SetObject setObject = new SetObject(new HashSet<String>(Arrays.asList("한놈","두식이")));
		return setObject;
	}
	@Bean // Setter를 통한 주입
	public SetObject setObject2() {
		SetObject setObject = new SetObject();
		setObject.setNameSet(new HashSet<String>(Arrays.asList("한놈","두식이","한놈","두식이")));
		return setObject;
	}
}

package kr.human.di.vo;

import org.springframework.stereotype.Component;

@Component
public class Mustang implements Car{
	@Override
	public void getCarName() {
		System.out.println("Mustang~~~~~");
	}
}

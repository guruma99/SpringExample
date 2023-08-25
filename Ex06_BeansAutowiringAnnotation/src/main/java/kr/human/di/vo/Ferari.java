package kr.human.di.vo;

import org.springframework.stereotype.Component;

@Component
public class Ferari implements Car{
	@Override
	public void getCarName() {
		System.out.println("페라리!!!!!");
	}
}

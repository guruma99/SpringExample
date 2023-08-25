package kr.human.di.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bond {
	@Autowired
	@Qualifier("mustang") // 동일타입 중 어떤것을 지정해준다.
	private Car car;
	
	public void showCar() {
		car.getCarName();
	}
}

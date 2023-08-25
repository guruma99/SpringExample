package kr.human.di.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.human.di.vo.MapObject;

public class MapObjectMain01 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("MapObject.xml");

		// 생성자로 Map를 주입한 객체 테스트
		MapObject mapObject1 = context.getBean("mapObject1", MapObject.class);
		System.out.println(mapObject1);

		// Setter로 Map을 주입한 객체 테스트
		MapObject mapObject2 = context.getBean("mapObject2", MapObject.class);
		System.out.println(mapObject2);

		// 참조를 통해서 Setter를 이용한 주입
		MapObject mapObject3 = context.getBean("mapObject3", MapObject.class);
		System.out.println(mapObject3);

		// map도 사용 가능
		@SuppressWarnings("unchecked")
		Map<String, Integer> map = context.getBean("map", HashMap.class);
		System.out.println(map);
		context.close();
	}
}

package kr.human.di.app;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import kr.human.di.config.MapObjectConfig;
import kr.human.di.vo.MapObject;

public class MapObjectMain02 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MapObjectConfig.class);

		// 생성자로 Map를 주입한 객체 테스트
		MapObject mapObject1 = context.getBean("mapObj1", MapObject.class);
		System.out.println(mapObject1);

		// Setter로 Map을 주입한 객체 테스트
		MapObject mapObject2 = context.getBean("mapObj2", MapObject.class);
		System.out.println(mapObject2);

		// 참조를 통해서 Setter를 이용한 주입
		MapObject mapObject3 = context.getBean("mapObj3", MapObject.class);
		System.out.println(mapObject3);

		// map도 사용 가능
		@SuppressWarnings("unchecked")
		Map<String, Integer> map = context.getBean("map", TreeMap.class);
		System.out.println(map);
		context.close();
	}
}

package kr.human.di.config;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.human.di.vo.MapObject;

@Configuration
public class MapObjectConfig {

	@Bean(name="mapObj1")
	public MapObject mapObject1() {
		Map<String, Integer> map  = new TreeMap<>();
		map.put("computer", 1285400);
		map.put("mouse", 1400);
		map.put("keyboard", 12000);
		MapObject mapObject = new MapObject(map); // 생성자를 통한 주입
		return mapObject;
	}
	
	@Bean(name="mapObj2")
	public MapObject mapObject2() {
		Map<String, Integer> map  = new TreeMap<>();
		map.put("computer", 1285400);
		map.put("mouse", 1400);
		map.put("keyboard", 12000);
		MapObject mapObject = new MapObject(); 
		mapObject.setMap(map); // Setter를 통한 주입
		return mapObject;
	}
	
	@Bean(name="map")
	public Map<String, Integer> getMap(){
		Map<String, Integer> map  = new TreeMap<>();
		map.put("computer", 1285400);
		map.put("mouse", 1400);
		map.put("keyboard", 12000);
		return map;
	}
	
	@Bean(name="mapObj3")
	public MapObject mapObject3() {
		MapObject mapObject = new MapObject(); 
		mapObject.setMap(getMap()); // 참조를 이용한 Setter를 통한 주입
		return mapObject;
	}
}

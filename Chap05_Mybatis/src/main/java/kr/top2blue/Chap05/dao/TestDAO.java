package kr.top2blue.Chap05.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

//이것을 적어야 내부적으로 DAOImple이 생기면서 testDao를 만들어 등록해 준다.
@Mapper
public interface TestDAO {
	//testMapper 파일을 참조하여 인터페이스를 만든다.
	//id가 메서드명이고 resultType이 리턴 타입이고 parameterType이 매개변수가 된다.
	//parameterType이 매개변수가 된다.
	//✅ DAOImpl을 만들지 않아도 된다!
	String selectToday();
	
	//C#이랑 파이선에서는 딕셔너리
	//KEY, VALUE 값으로 저장하는게 HASHMAP
	int selectSum(HashMap<String, Integer> map);
	
}

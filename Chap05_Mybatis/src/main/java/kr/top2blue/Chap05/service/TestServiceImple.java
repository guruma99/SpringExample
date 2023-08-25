package kr.top2blue.Chap05.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.top2blue.Chap05.dao.TestDAO;

@Service("testService")
//빨간줄 에러 뜨면 여기서 add map 누르면 됨. 커서 가져다대고
public class TestServiceImple implements TestService {

	@Autowired
	TestDAO testDAO;
	
	@Override
	public String getToday() {
		return testDAO.selectToday();
	}

	@Override
	public int getSum(int num1, int num2) {
		// 여러개를 넘길 떄는 vo를 만들거나 map으로 만들어 넘겨야하는데 몇 개 없기 때문에 hashmap으로 함.
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num1", num1);
		map.put("num2", num2);
		return testDAO.selectSum(map);
	}
}

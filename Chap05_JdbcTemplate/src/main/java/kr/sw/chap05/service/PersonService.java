package kr.sw.chap05.service;

import java.util.List;

import kr.sw.chap05.vo.PersonVO;

public interface PersonService {
	// 모든 데이터 얻어오기
	List<PersonVO> selectAll();
	// 1개 얻어오기
	PersonVO selectByIdx(int idx);
	// 저장하기
	void insert(PersonVO personVO);
	// 수정하기
	void update(PersonVO personVO);
	// 삭제하기	
	void delete(int idx);
}

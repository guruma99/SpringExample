package kr.top2blue.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.top2blue.jpa.dao.MemoRepository;
import kr.top2blue.jpa.vo.Memo;

@Service("memoService")
public class MemoServiceImpl implements MemoService {

	@Autowired
	private MemoRepository memoRepository;

	@Override
	public List<Memo> selectList() {
		List<Memo> list = new ArrayList<>();
//	//방법 1 : 옛날방식
//	for(Memo m : memoRepository.findAll()) list.add(m);

		// 방법 2 :
		// java8에 추가된 stream과 동일 //// or 람다도 가능
		memoRepository.findAll().forEach((v) -> {
			list.add(v);
		});

		return list;
	}

	@Override
	public boolean insert(Memo memo) {
		boolean isSave = false;

		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSave;

	}
}

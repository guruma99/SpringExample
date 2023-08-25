package kr.top2blue.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.jpa.vo.Memo;

//첫째인자 vo이름 <>꺽새들어가는 부분 기본자료쓰면안된다.
public interface MemoRepository extends CrudRepository<Memo, Integer> {

}

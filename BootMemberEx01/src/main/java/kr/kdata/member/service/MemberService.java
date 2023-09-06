package kr.kdata.member.service;

import java.util.List;

import kr.kdata.member.vo.MemberVO;

public interface MemberService {
	// 로그인
	MemberVO login(MemberVO vo);
	//아이디 중복확인
	int getByUserIdCount(String userid);
	//1개 얻기
	MemberVO getById(int id);
	MemberVO getByUserId(String userid);

	//모두 얻기
	List<MemberVO> getList();
	
	//저장
	boolean insert(MemberVO vo);
	//수정
	boolean update(MemberVO vo);
	//삭제
	boolean delete(MemberVO vo);
	//아이디 찾기
	MemberVO findUserId(MemberVO vo);
	//비밀번호 찾기
	MemberVO findPassword(MemberVO vo);
}

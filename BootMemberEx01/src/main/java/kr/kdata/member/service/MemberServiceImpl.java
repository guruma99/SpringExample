package kr.kdata.member.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kdata.member.dao.MemberDAO;
import kr.kdata.member.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;

@Service("memberService")
@Slf4j
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public MemberVO login(MemberVO vo) {
		log.info("login() 호출");
		MemberVO memberVO = null;

		try {
			// 1.넘어온 아이디가 존재하는지 판단
			MemberVO mvo = memberDAO.selectByUserId(vo.getUserid());
			if (mvo != null) { // 지정 아이디의 회원이 있다면
				if (mvo.getPassword().equals(vo.getPassword())) {
					// mvo의 패스워드와 넘어온 vo.패스워드와 같다면
					memberVO = mvo;
				} else {
					// 아이디는 있는데 비번이 틀리다.
				}
			} else {
				// 아이디가 없다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("login() 리턴 : " + vo, memberVO);
		return memberVO;
	}

	@Override
	public int getByUserIdCount(String userid) {
		log.info("getByUserIdCount() 호출");
		MemberVO memberVO = null;
		int count = 0;

		try {
			count = memberDAO.selectByUserIdCount(userid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("getByUserIdCount() 리턴 : " + userid, count);
		return count;
	}

	@Override
	public MemberVO getById(int id) {
		log.info("getById() 호출");
		MemberVO memberVO = null;

		try {
			memberVO = memberDAO.selectById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("getById() 리턴 : " + id, memberVO);
		return memberVO;
	}

	@Override
	public MemberVO getByUserId(String userid) {
		log.info("getByUserId() 호출");
		MemberVO memberVO = null;

		try {
			memberVO = memberDAO.selectByUserId(userid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("getByUserId() 리턴 : " + userid, memberVO);
		return memberVO;
	}

	@Override
	public List<MemberVO> getList() {
		log.info("getList() 호출");
		List<MemberVO> list = null;

		try {
			list = memberDAO.selectByList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("getList() 리턴 : " + list);
		return list;
	}

	@Override
	public boolean insert(MemberVO vo) {
		log.info("insert() 호출" + vo);
		boolean result = false;

		try {
			if (vo != null) {
				memberDAO.insert(vo);
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("insert() 리턴 : " + result);
		return result;
	}

	@Override
	public boolean update(MemberVO vo) {

		return false;
	}

	@Override
	public boolean delete(MemberVO vo) {

		return false;
	}

	@Override
	public MemberVO findUserId(MemberVO vo) {
		log.info("findUserId() 호출", vo);
		MemberVO memberVO = null;

		try {

			MemberVO dbVO = memberDAO.selectByPhone(vo.getPhone());
			if (dbVO != null) {// 전화번호가 있고
				// 이름도 같으면
				if (dbVO.getUsername().equals(vo.getUsername())) {
					memberVO = dbVO;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("findUserId() 리턴 : " + vo, memberVO);
		return memberVO;
	}

	@Override
	public MemberVO findPassword(MemberVO vo) {
		log.info("findPassword() 호출", vo);
		MemberVO memberVO = null;

		try {

			MemberVO dbVO = memberDAO.selectByUserId(vo.getUserid());
			if (dbVO != null) { // 아이디가 있고
				// 이메일도 같다면
				if (dbVO.getEmail().equals(vo.getEmail())) {

					// 임시 비밀번호를 만들고
					String newPassword = MakePassword.makePassword(10);
					// DB에 비밀번호를 임시 비번으로 변경하고
					HashMap<String, String> map = new HashMap<>();
					map.put("userid", dbVO.getUserid());
					map.put("password", newPassword);
					memberDAO.updatePassword(map);
					// 임시비밀번호를 넣어서
					dbVO.setPassword(newPassword);
					memberVO = dbVO;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("findPassword() 리턴 : " + vo, memberVO);
		return memberVO;

	}

}

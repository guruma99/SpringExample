package kr.top2blue.board.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.top2blue.board.dao.BoardRepository;
import kr.top2blue.board.vo.Board;
import lombok.extern.slf4j.Slf4j;

//보드서비스 구현

@Service("boardService") // 첫자 소문자로만 바꿔서 등록
@Slf4j // 로그 찍기위해 임포트
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepository;
//===> 여기까지 등록하면 BoaqrdServiceImpl 클래스에 빨간줄 생기는데 거기에 마우스 커서대고 Add unimplements 어쩌구 클릭하면 밑에것들 자동 생성됨.

	// ✅ 목록보기
	@Override
	public List<Board> selectList() {
		// 첫줄에 받은 데이터 로그로 출력
		log.info("===== 서비스의 selectList() 목록보기 호출 =====");
		// 두번째 줄에는 리턴될 자료형을 선언
		List<Board> list = new ArrayList<>();

		// 로직을 수행한다.
		list = boardRepository.findAllByOrderByIdDesc();

		// 리턴 바로 전에 리턴되는 값을 로그로 출력
		log.info("서비스의 selectList()리턴 : {}", list);
		return list;
	}

	// ✅ 등록하기
	@Override
	public boolean insert(Board board) {
		// 첫줄에 받은 데이터 로그로 출력
		log.info("서비스의 insert({}) 호출 ", board);
		// 두번째 줄에는 리턴될 자료형을 선언
		boolean isSave = false;
		try {
			if (board != null) {
				board.setRegdate(new Date());
				boardRepository.save(board);
				isSave = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 리턴 바로 전에 리턴되는 값을 로그로 출력
		log.info("서비스의 insert({}) 리턴 : {}", board, isSave);
		return isSave;
	}

	// ✅ 글 1개만 상세보기
	@Override
	public Board selectById(Long id) {
		Optional<Board> optional = boardRepository.findById(id); // 글 1개 얻기
		if (optional.isPresent()) { // 존재한다면
			return optional.get(); // 글을 리턴
		}

		return null; // 없으면 null 리턴
	}

	// ✅ 수정 완료
	@Override
	public boolean update(Board board) {
		// DB에서 해당 글을 읽어와 넘어온 비번과 비번이 일치할때만 수정을 수정한다.
		log.info("서비스의 update()호출 : {}", board);
		boolean result = false;
		// 1. DB에서 해당 글번호의 글을 읽자.
		Optional<Board> optional = boardRepository.findById(board.getId()); // 글 1개 얻기
		if (optional.isPresent()) { // 존재한다면
			Board dbBoard = optional.get(); // 글을 읽고
			// 해당 글을 읽어와 넘어온 비번과 비번이 일치할때만
			if (dbBoard.getPassword().equals(board.getPassword())) {
				// 수정을 처리한다.
				board.setRegdate(new Date()); // 작성일을 수정한 날짜로 변경
				boardRepository.save(board);
				result = true;
			}
		}
		log.info("서비스의 update()리턴 : {}", board, result);
		return result;
	}

	// ✅ 삭제 완료
	@Override
	public boolean delete(Board board) {
		// DB에서 해당 글을 읽어와 넘어온 비번과 비번이 일치할때만 수정을 수정한다.
		log.info("서비스의 delete()호출 : {}", board);
		boolean result = false;
		// 1. DB에서 해당 글번호의 글을 읽자.
		Optional<Board> optional = boardRepository.findById(board.getId()); // 글 1개 얻기
		if (optional.isPresent()) { // 존재한다면
			Board dbBoard = optional.get(); // 글을 읽고
			// 해당 글을 읽어와 넘어온 비번과 비번이 일치할때만
			if (dbBoard.getPassword().equals(board.getPassword())) {
				// 삭제 처리한다.
				boardRepository.deleteById(board.getId());
			}
		}
		log.info("서비스의 delete()리턴 : {}", board, result);
		return result;
	
	}
}

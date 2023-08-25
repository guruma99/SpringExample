package kr.top2blue.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.top2blue.board.service.BoardService;
import kr.top2blue.board.vo.Board;
import lombok.extern.slf4j.Slf4j;

@RestController // 뷰가 없이 내용을 직접 출력하는 컨트롤러
@Slf4j
@RequestMapping(value = "/api") // 앞으로 생성하는 모든 주소 앞에 /api 를 붙여준다.
public class BoardApiController {

	@Autowired
	private BoardService boardService;

	@GetMapping(value = {"/", "/list"})
	public List<Board> selectList() {
		log.info("BoardApiController 의 selectList() 호출!!!");
		List<Board> list = null;
		// 결과 얻기
		list = boardService.selectList();

		log.info("BoardApiController 의 selectList() 리턴!!!");
		return list;
	}
	
	//Get 방식으로 접근시 목록보기로 강제 이동시킨다.
	@GetMapping("/insertOk") //누군가가 주소표시에서 직접 insertOk를 입력했다면? (도배질 장난쳤다면)
	public String insertOkGet() {
		return "redirect:/";
	}
	
	@PostMapping("/insertOk") //Post 전송일때만 처리
	public String insertOkPost(@ModelAttribute Board board) {
		if(board!= null) {
			boardService.insert(board);
		}
		return "redirect:/";
	}
	
	
}

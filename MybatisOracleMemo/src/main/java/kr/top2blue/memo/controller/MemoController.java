package kr.top2blue.memo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import kr.top2blue.memo.service.MemoService;
import kr.top2blue.memo.vo.MemoVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemoController {
	
	@Autowired
	private MemoService memoService;
	
	@GetMapping("/")
	public String home(Model model) {
		log.info("MemoCOntroller의 home 호출!!!");
		List<MemoVO> list = memoService.getList();
		model.addAttribute("list",list);
		return "index"; // /templeate/index.html 파일을 이용하여 보여줘.
	}
	
	
	@PostMapping("/updateOK")
	//하나는 ModelAttribute 로 받고 여러개는? @RequestParam으로 받는다?????아닌가?
	public String updateOK(@ModelAttribute MemoVO memoVO, @RequestParam(defaultValue = "") String mode,
			HttpServletRequest request) {
		log.info("MemoCOntroller의 update 호출 : {}, {}", memoVO, mode);
		if(memoVO!=null) {
			memoVO.setIp(request.getRemoteAddr()); //아이피 주소를 얻어서 넣어준다.
		}
		
		
		switch (mode) {
		case "insert" :
			memoService.insert(memoVO);
			break;
			
		case "update" :
			memoService.update(memoVO);
			break;
			
		case "delete" :
			memoService.delete(memoVO);
			break;
		}
		return "redirect:/"; // (루트)/의 주소로 이동해라
	}	
}
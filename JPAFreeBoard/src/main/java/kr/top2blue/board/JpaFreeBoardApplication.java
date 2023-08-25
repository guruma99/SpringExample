package kr.top2blue.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import kr.top2blue.board.dao.BoardRepository;
import kr.top2blue.board.vo.Board;

@SpringBootApplication
@EnableJpaAuditing
public class JpaFreeBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaFreeBoardApplication.class, args);
	}

	@Autowired
	private BoardRepository boardRepository;

	@Bean // 애플리케이션 시작시 자동으로 자동시키고 싶은 코드를 여기에 넣는다.
	CommandLineRunner getCommandLineRunner() {
		return (args) -> {
			
//			boardRepository.deleteAll();
			
//			boardRepository.save(new Board("주인장1", "12345", "제목이야1", "내용이야1"));
//			boardRepository.save(new Board("주인장2", "12345", "제목이야2", "내용이야2"));
//			boardRepository.save(new Board("주인장3", "12345", "제목이야3", "내용이야3"));
			
			
			System.out.println(boardRepository.count() + "개 있다!!");

			System.out.println("글번호 오름차순!!");
			
			for (Board vo : boardRepository.findAll()) {
				System.out.println(vo);
			}
			System.out.println("-".repeat(80));

			//============================================
			
			System.out.println("글번호 내림차순!!");

			for (Board vo : boardRepository.findAllByOrderByIdDesc()) {
				System.out.println(vo);
			}
			System.out.println("-".repeat(80));
		};
	}
}

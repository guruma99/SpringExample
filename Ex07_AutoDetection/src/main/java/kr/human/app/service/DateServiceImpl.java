package kr.human.app.service;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service("dateService") // 서비스 계열의 클래스들은 @Service로 등록한다.
public class DateServiceImpl implements DateService {
	@Override
	public LocalDate getNextAssessmentDate() {
		return LocalDate.of(2023, 6, 14);
	}
}

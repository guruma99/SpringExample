package kr.human.boot.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
	// 현재날짜 구하기
	public String getToday() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd(E) hh:mm:ss"));
	}
}

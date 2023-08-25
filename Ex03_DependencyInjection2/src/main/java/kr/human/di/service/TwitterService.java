package kr.human.di.service;

import kr.human.di.vo.MessageService;

public class TwitterService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println(rec + "에게 " + msg + "를 트위터로 전송합니다.");
		return true;
	}

}
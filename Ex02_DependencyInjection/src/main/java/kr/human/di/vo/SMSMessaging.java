package kr.human.di.vo;

public class SMSMessaging implements Messaging{

	@Override
	public void sendMessage() {
		System.out.println("단문 문자 메세지를 전송합니다.");
	}

}

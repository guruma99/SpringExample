package kr.top2blue.DI1.vo;

public class SMSMessaging implements Messaging{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("단문 문자를 전송합니다.");
	}
}

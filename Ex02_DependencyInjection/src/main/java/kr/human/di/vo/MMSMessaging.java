package kr.human.di.vo;

public class MMSMessaging implements Messaging{

	@Override
	public void sendMessage() {
		System.out.println("장문 문자 메세지를 전송합니다.");
	}

}

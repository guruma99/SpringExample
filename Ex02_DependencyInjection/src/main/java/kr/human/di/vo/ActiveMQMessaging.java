package kr.human.di.vo;

public class ActiveMQMessaging implements Messaging{

	@Override
	public void sendMessage() {
		System.out.println("ActiveMQ를 이용하여 실시간 메세지를 전송합니다.");
	}

}

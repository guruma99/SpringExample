package kr.human.di.app;

import kr.human.di.vo.MessageService;

public class MyApplication2 {
	private MessageService service1;
	private MessageService service2;
	
	public MyApplication2() {
		
	}

	public MyApplication2(MessageService service1, MessageService service2) {
		this.service1 = service1;
		this.service2 = service2;
	}

	public void setService1(MessageService service1) {
		this.service1 = service1;
	}
	
	public void setService2(MessageService service2) {
		this.service2 = service2;
	}

	public boolean processMessage(String msg, String rec){
		return service1.sendMessage(msg, rec) && service2.sendMessage(msg, rec);
	}
}

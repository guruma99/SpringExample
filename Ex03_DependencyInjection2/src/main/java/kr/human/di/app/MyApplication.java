package kr.human.di.app;

import kr.human.di.vo.MessageService;

public class MyApplication {
	private MessageService service;
	
	public MyApplication() {
		
	}

	public MyApplication(MessageService service) {
		this.service = service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	public boolean processMessage(String msg, String rec){
		return service.sendMessage(msg, rec);
	}
}

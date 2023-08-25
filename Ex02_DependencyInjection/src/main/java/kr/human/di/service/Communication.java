package kr.human.di.service;

import kr.human.di.vo.Messaging;

public class Communication {
	// Communication클래스는 Messaging 인터페이스를 의존한다.
    private Messaging messaging;
    
    // Setter를 만든다.
    public void setMessaging(Messaging messaging){
        this.messaging = messaging;
    }
 
    // 대화!!!!
    public void communicate(){
        messaging.sendMessage();
    }
}
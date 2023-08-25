package kr.human.di.service;

import kr.human.di.vo.Encryption;
import kr.human.di.vo.Messaging;

public class Communication3 {
	// Communication2클래스는 Encryption 인터페이스를 의존한다.
    private Encryption encryption;
    private Messaging  messaging;
    
    // 생성자를 통한 의존성 주입
    public Communication3(Encryption encryption) {
		this.encryption = encryption;
	}

    // Setter를 통한 주입
    public void setMessaging(Messaging messaging) {
    	this.messaging = messaging;
    }
   
	// 대화!!!!
    public void communicate(){
        encryption.encryptData();
        messaging.sendMessage();
    }

}
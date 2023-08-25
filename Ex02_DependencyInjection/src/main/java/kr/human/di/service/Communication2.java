package kr.human.di.service;

import kr.human.di.vo.Encryption;

public class Communication2 {
	// Communication2클래스는 Encryption 인터페이스를 의존한다.
    private Encryption encryption;
    
    // 생성자를 통한 의존성 주입
    public Communication2(Encryption encryption) {
		this.encryption = encryption;
	}

	// 대화!!!!
    public void communicate(){
        encryption.encryptData();
    }
}
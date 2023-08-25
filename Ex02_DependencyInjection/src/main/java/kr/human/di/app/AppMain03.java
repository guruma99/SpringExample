package kr.human.di.app;

import kr.human.di.service.Communication2;
import kr.human.di.vo.Encryption;
import kr.human.di.vo.MD5Encryption;
import kr.human.di.vo.RSAEncryption;

public class AppMain03 {
	public static void main(String[] args) {
		// Spring Framework를 사용하지 않았다면
		Encryption encryption = new MD5Encryption();
		
		Communication2 communication1 = new Communication2(encryption); // 생성자로 주입
		communication1.communicate();
		
		Communication2 communication2 = new Communication2(new RSAEncryption()); // 생성자로 주입
		communication2.communicate();
	}
}

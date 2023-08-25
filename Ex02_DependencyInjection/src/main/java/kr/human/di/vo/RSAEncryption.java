package kr.human.di.vo;

public class RSAEncryption implements Encryption{

	@Override
	public void encryptData() {
		System.out.println("RSA 알고리즘으로 암호화 합니다.");
	}

}

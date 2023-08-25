package kr.human.di.vo;

public class MD5Encryption implements Encryption{

	@Override
	public void encryptData() {
		System.out.println("MD5 알고리즘으로 암호화 합니다.");
	}

}

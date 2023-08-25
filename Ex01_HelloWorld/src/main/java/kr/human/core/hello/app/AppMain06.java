package kr.human.core.hello.app;

import kr.human.core.hello.vo.Greeter;

public class AppMain06 {
//일반 적으로 클래스를 사용하는 방법
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter =  new Greeter();
		greeter.setFormat("%s");
		System.out.println("반가워요");
		greeter.setFormat("[%s]");
		System.out.println("반가워요");
	}

}

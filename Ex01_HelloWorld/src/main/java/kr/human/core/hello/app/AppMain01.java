package kr.human.core.hello.app;

import kr.human.core.hello.vo.HelloWorld;
import kr.human.core.hello.vo.HelloWorldImpl;

public class AppMain01 {
	public static void main(String[] args) {
		// 지금까지의 클래스 사용법
		HelloWorld helloWorld = new HelloWorldImpl(); // 사용자가 직접 객체 생성하고
		helloWorld.sayHello("한사람"); // 메서드를 호출
	}
}

package kr.top2blue.Hello.vo;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String name) {
		return "반가워요 " + name + "님!!!";
	}

}

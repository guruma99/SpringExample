package kr.human.core.hello.vo;

public class HelloWorldImpl implements HelloWorld{
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + "!!!");
	}
}

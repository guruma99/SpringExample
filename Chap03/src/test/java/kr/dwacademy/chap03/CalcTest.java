package kr.dwacademy.chap03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.System.out; // System.을 붙이지않고도 콘솔확인이 가능하다. static이 붙으면 빼도 됨!

public class CalcTest {
	
	private static Calc calc;
	
	@BeforeAll
	public static void init() {
		out.println("@BeforeAll 나는 단 1회 실행됩니다.");
		calc = new Calc();
	}
	
	@BeforeEach
	public void initMethod() {
		out.println("@BeforeEach 나는 테스트할 때마다 먼저 실행됩니다.");
	}

	@AfterAll
	public static void destory() {
		calc = null;
		out.println("@AfterAll 나는 마지막 단 1회 실행됩니다.");
	}
	
	@AfterEach
	public void destoryMethod() {
		out.println("@AfterEach 나는 테스트할 때마다 뒤에 실행됩니다.");
	}
	
	//더하기가 정확하게 이루어지는지 테스트
	@DisplayName("더하기 테스트")
	@Test
	public void testAdd() {
		assertEquals(calc.add(3, 5),8);
	}
	
	@DisplayName("빼기 테스트")
	@Test
	public void testsub() {
		assertEquals(calc.sub(3, 5),-2);
		assertEquals(calc.sub(10, 5),5);
	}
}

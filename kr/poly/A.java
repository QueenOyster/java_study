package kr.poly;

import java.lang.*; // 생략1

public class A extends Object { // 생략2 (extends Object), 원래 java.lang.Object

	// 생략3
	public A() {
		super();
	}

	public void display() {
		System.out.println("나는 A이다.");
	}

	@Override
	// toString 생략시 -> Object의 toString 실행 -> a, o등의 번지 kr.poly.A@279f2327
	public String toString() {
		return "재정의된 메서드 입니다.";
	}

}

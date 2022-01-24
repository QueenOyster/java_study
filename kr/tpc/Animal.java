package kr.tpc;

public class Animal extends Object{
	// Dog, Cat -> eat() 추출
	public void eat() {
		System.out.println("?"); // 포괄적, 추상적
	}
	public Animal() {
		super(); // new Object();
	}

}

package kr.tpc;

public class Dog extends Animal {
	// 이름, 나이, 종: 상태정보
	public void eat() { // 재정의(override)
		System.out.println("개 처럼 먹다.");
	}
}

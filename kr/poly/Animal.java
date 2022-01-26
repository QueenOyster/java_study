package kr.poly;

public abstract class Animal { // 추상 클래스(불완전한 객체) -> Animal ani = new Animal() X
	public abstract void eat(); // 추상매서드(불완전한 메서드)

	public void move() { // 구현 메서드 -> 부모 공유하는 자식은 언제든지 사용 가능
		System.out.println("무리를 지어서 이동한다.");
	}
}

import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon() X
		/* 추상클래스 vs 인터페이스
		 * 공통점: 다형성 보장, 객체 생성 불가, 하위클래스에 의해 구현되어야함, 부모의역할로 사용, 추상메서드를 가짐
		 * 추상클래스: 서로 기능이 비슷한 클래스의 공통부분을 묶을 때 사용, 구현 메서드와 추상 메서드를 함꼐 가질 수 있음.
		 * 인터페이스: 서로 기능이 다른 클래스의 공통부분을 묶을 때 사용, 100% 추상 메서드, 구현 메서드 X, 다중 상속 O, final static O 
		 */
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		// Message Polymorphism
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}

}

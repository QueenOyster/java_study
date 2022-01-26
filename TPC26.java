import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon() X
		/* 추상클래스 vs 인터페이스
		 * 공통점: 다형성 보장
		 * 차이점: 자체 타입 객체 생성 가능여부
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

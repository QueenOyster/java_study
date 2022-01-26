import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		// Animal a = new Animal() X
		// a.eat() X, abstract class여서 불가능

		// eat() -- 재정의(override) -->eat()
		// 추상클래스: 업캐스팅되어 사용, 부모의역할, 명령을 내리는쪽으로 사용
		Animal ani = new Dog();
		ani.eat(); // eat{?} -> eat{개처럼 먹다}
		ani.move();// 구현클래스

		ani = new Cat();
		ani.eat(); // eat{?} -> eat{고양이 처럼 먹다}
		ani.move();
		((Cat) ani).night();
	}

}

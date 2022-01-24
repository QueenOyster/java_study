import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않는 경우
		// ex) 직접 설계자, 소스 아는사람 등
		Dog d = new Dog();
		d.eat(); // Override

		Cat c = new Cat();
		c.eat(); // Override
		c.night();

		System.out.println("-------------");
		// Animal 부모클래스를 사용하는 경우
		// ex) Dog, Cat의 클래스파일 밖에 없는경우 -> Dog의 소스파일 내용 몰라도 실행 가능
		Animal ani = new Dog(); // Object Up-Casting (Auto) 자동형변환
		ani.eat(); // Override

		ani = new Cat();
		ani.eat(); // Override

		// ani.night();
		((Cat) ani).night(); // Down-Casting, 강제형변환 필요

	}

}

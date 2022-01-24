import kr.tpc.*;

public class TPC22 {

	public static void main(String[] args) {
		
		// 1. Cat ani = new Cat();
		// 2. Object ani = new Cat(); // Up-Casting
		// 3. 
		Animal ani = new Cat(); // Up-Casting
		ani.eat(); // 컴파일 시점 -> Animal's eat, 실행 시점 -> Dog's eat(동적 바인딩)
		
		// ani.night(); // Animal에는 night 메소드 없으므로 Error
		// Cat c = (Cat)ani; // Down-Casting
		// c.night();
		((Cat)ani).night(); // Priority Control -> (())  
		
		ani = new Dog();
		ani.eat();
		// 다형성: 상위 클래스가 하위 클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
	
		Object o = new Dog(); // Up-Casting
		// o.eat(); // eat 메소드가 없으므로 Error
		((Dog)o).eat(); // Down-Casting
	}

}

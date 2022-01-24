import kr.tpc.*;

public class TPC21 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class밖에 없는 경우
		Animal ani = new Dog(); // Up-Casting
		ani.eat(); // Message Polymorphism
		ani = new Cat(); // Up-Casting
		ani.eat(); // Message Polymorphism
		// ani.night();
		Cat cc = (Cat)ani;
		cc.night();
		//((Cat)ani).night(); // Down-Casting
	}

}

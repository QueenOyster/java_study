import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {// Animal(like remote-control) <= [Dog.class, Cat.class]

	public static void main(String[] args) {

		// 1. when we have '.java' source file
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();

		// 2. when we only have '.class' file		
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}

}

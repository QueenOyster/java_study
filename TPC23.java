import kr.tpc.*;

public class TPC23 {

	public static void main(String[] args) {
		// 1. ������ �μ�
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);

	}

	// Up-Casting
	private static void display(Animal r) {// ������ �μ�
		r.eat();
		// r.night();
		if (r instanceof Cat) {
			((Cat) r).night(); // Down-Casting
		}

	}

}

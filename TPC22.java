import kr.tpc.*;

public class TPC22 {

	public static void main(String[] args) {
		
		// 1. Cat ani = new Cat();
		// 2. Object ani = new Cat(); // Up-Casting
		// 3. 
		Animal ani = new Cat(); // Up-Casting
		ani.eat(); // ������ ���� -> Animal's eat, ���� ���� -> Dog's eat(���� ���ε�)
		
		// ani.night(); // Animal���� night �޼ҵ� �����Ƿ� Error
		// Cat c = (Cat)ani; // Down-Casting
		// c.night();
		((Cat)ani).night(); // Priority Control -> (())  
		
		ani = new Dog();
		ani.eat();
		// ������: ���� Ŭ������ ���� Ŭ�������� ������ �޼����� ���� �ٸ��� ���۽�Ű�� ����
	
		Object o = new Dog(); // Up-Casting
		// o.eat(); // eat �޼ҵ尡 �����Ƿ� Error
		((Dog)o).eat(); // Down-Casting
	}

}

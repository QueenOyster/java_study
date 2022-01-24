import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		// Animal �θ�Ŭ������ ������� �ʴ� ���
		// ex) ���� ������, �ҽ� �ƴ»�� ��
		Dog d = new Dog();
		d.eat(); // Override

		Cat c = new Cat();
		c.eat(); // Override
		c.night();

		System.out.println("-------------");
		// Animal �θ�Ŭ������ ����ϴ� ���
		// ex) Dog, Cat�� Ŭ�������� �ۿ� ���°�� -> Dog�� �ҽ����� ���� ���� ���� ����
		Animal ani = new Dog(); // Object Up-Casting (Auto) �ڵ�����ȯ
		ani.eat(); // Override

		ani = new Cat();
		ani.eat(); // Override

		// ani.night();
		((Cat) ani).night(); // Down-Casting, ��������ȯ �ʿ�

	}

}

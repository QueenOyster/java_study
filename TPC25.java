import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		// Animal a = new Animal() X
		// a.eat() X, abstract class���� �Ұ���

		// eat() -- ������(override) -->eat()
		// �߻�Ŭ����: ��ĳ���õǾ� ���, �θ��ǿ���, ����� ������������ ���
		Animal ani = new Dog();
		ani.eat(); // eat{?} -> eat{��ó�� �Դ�}
		ani.move();// ����Ŭ����

		ani = new Cat();
		ani.eat(); // eat{?} -> eat{����� ó�� �Դ�}
		ani.move();
		((Cat) ani).night();
	}

}

package kr.tpc;

public class Dog extends Animal {
	// �̸�, ����, ��: ��������
	public void eat() { // ������(override)
		System.out.println("�� ó�� �Դ�.");
	}
	public Dog() {
		super(); // new Animal();
	}
	
}

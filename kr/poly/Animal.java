package kr.poly;

public abstract class Animal { // �߻� Ŭ����(�ҿ����� ��ü) -> Animal ani = new Animal() X
	public abstract void eat(); // �߻�ż���(�ҿ����� �޼���)

	public void move() { // ���� �޼��� -> �θ� �����ϴ� �ڽ��� �������� ��� ����
		System.out.println("������ ��� �̵��Ѵ�.");
	}
}

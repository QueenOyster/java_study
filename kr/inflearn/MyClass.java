package kr.inflearn;

// public(�ܺ� ���ٵ� ���) �����Ǹ� default�� '�ǹ�'(Package ���� ���� ���, �ܺ� ����), default�� public �ƴ�! 
public class MyClass {
	public int sum(int a, int b) { // �޼���� �����̴� (sum�� hap�� �־� ������)
		int hap = 0;
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}

}

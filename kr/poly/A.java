package kr.poly;

import java.lang.*; // ����1

public class A extends Object { // ����2 (extends Object), ���� java.lang.Object

	// ����3
	public A() {
		super();
	}

	public void display() {
		System.out.println("���� A�̴�.");
	}

	@Override
	// toString ������ -> Object�� toString ���� -> a, o���� ���� kr.poly.A@279f2327
	public String toString() {
		return "�����ǵ� �޼��� �Դϴ�.";
	}

}


public class TPC08 {

	public static void main(String[] args) {
		// main �޼ҵ�� �ݵ�� static�� �پ��־�� ���� ����
		int a = 30;
		int b = 50;
		int v = add(a, b); // static method call, ���Ÿ�ü ������
		System.out.println(v);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}

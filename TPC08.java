
public class TPC08 {

	public static void main(String[] args) {
		// main 메소드는 반드시 static이 붙어있어야 실행 가능
		int a = 30;
		int b = 50;
		int v = add(a, b); // static method call, 이탤릭체 기울어짐
		System.out.println(v);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}

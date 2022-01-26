import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		System.out.println(a.toString());
		System.out.println(a); // toString()°ú µ¿ÀÏ
		
		System.out.println("---------------");
		
		Object o = new A(); // Up-Casting
		((A)o).display(); // Down-Casting
		System.out.println(o.toString());
	}
}

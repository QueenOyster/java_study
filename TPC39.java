// (import java.lang.*;)

public class TPC39 {

	public static void main(String[] args) {
		// Wrapper Class: 기본 자료형 -> 객체 자료형
		
		int a = 1;
		Integer b = new Integer(1); // (java.lang.)Integer
		Integer c = 1; // auto-Boxing -> new Integer(1)
		System.out.println(b.intValue()); // UnBoxing
		System.out.println(b.toString()); // UnBoxing

		System.out.println("--------------");

		Object[] obj = new Object[3];
		// 1, 2, 3
		obj[0] = 1; // auto Boxing
		obj[1] = new Integer(2);
		obj[2] = new Integer(3);

		System.out.println(obj[0]); // 1
		System.out.println(obj[1].toString()); // 2
		System.out.println(obj[2].toString()); // 3

		System.out.println("--------------");

		// "100" + "100" -> 200 만들기
		String x = "100";
		String y = "100";
		System.out.println(x + y); // concatenate "100100"
		int v1 = Integer.parseInt(x); // .parseInt -> Static
		int v2 = Integer.parseInt(y);
		System.out.println(v1+v2); // 200
		
		System.out.println("--------------");
		
		// 100 + 100 -> "100100" 만들기
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		System.out.println(s1+s2); // "100100"
		
	}

}

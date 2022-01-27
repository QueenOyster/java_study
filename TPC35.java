
public class TPC35 {
	public static void main(String[] args) {

		// Heap Area에 생성
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");

		if (str1 == str2) { // 번지 비교
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // NO

		if (str1.equals(str2)) { // 내용 비교 ★
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES

		System.out.println("---------------------");

		// Literal Pool에 상수 생성
		String str3 = "APPLE";
		String str4 = "APPLE";

		if (str3 == str4) { // 이미 생성되었으므로, 같은 번지를 가르킴
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES

		if (str3.equals(str4)) { // 내용 비교 ★
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES
	}

}

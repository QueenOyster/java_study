
public class TPC35 {
	public static void main(String[] args) {

		// Heap Area�� ����
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");

		if (str1 == str2) { // ���� ��
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // NO

		if (str1.equals(str2)) { // ���� �� ��
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES

		System.out.println("---------------------");

		// Literal Pool�� ��� ����
		String str3 = "APPLE";
		String str4 = "APPLE";

		if (str3 == str4) { // �̹� �����Ǿ����Ƿ�, ���� ������ ����Ŵ
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES

		if (str3.equals(str4)) { // ���� �� ��
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} // YES
	}

}

import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("ȫ�浿", 40, "010-1111-1111", "����");
		// setter method - not needed

		System.out.println(m.toString()); // '.toString()' ���� ����
		/* getter method - not needed
		m.getName()
		m.getAge()...
		*/
		
	}

}
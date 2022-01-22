import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
		// setter method - not needed

		System.out.println(m.toString()); // '.toString()' 생략 가능
		/* getter method - not needed
		m.getName()
		m.getAge()...
		*/
		
	}

}

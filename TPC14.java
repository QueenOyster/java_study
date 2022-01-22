import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		/*
		m.name = "È«±æµ¿";
		m.age = 1000; // 1000 = too big
		m.tel = "010-1111-1111";
		m.addr = "¼­¿ï";
		*/
		m.setName("È«±æµ¿");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("¼­¿ï");
		
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.println(m.getAddr());

	}

}

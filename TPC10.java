import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// int, float, char, boolean, string -> Primitive Data Type
		int a;
		a = 10;
		System.out.println(a);
		
		// 책(BookDTO)이라는 자료형을 만들자. -> class 이용
		// 객체 생성
		BookDTO b = new BookDTO();
		b.title = "Java";
		b.price = 17000;
		b.company = "Youngjin";
		b.page = 670;
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);
		
	}

}

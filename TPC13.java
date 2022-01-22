import kr.tpc.BookDTO;

public class TPC13 {

	public static void main(String[] args) {
		// Class(설계) -> Object(객체변수) -> Instance(메모리 생성 후)
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890; // 각 변수 4개

		BookDTO dto; // dto(Object: 객체) 

		dto = new BookDTO(title, price, company, page); // dto(Instance: 인스턴스 변수) - 실제 책 1권이 된 것

		bookPrint(dto); // Call By Reference - 객체는 바구니 같은 개념
	}

	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page);
	}
}

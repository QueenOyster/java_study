package kr.tpc;

// 책(Object) -> 제목, 가격, 출판사, 페이지수...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 생성자가 없다 -> 디폴트 생성자 메서드는 작성하지 않아도 자동 생성됨
	// 생성자가 있다 -> 디폴트 생성자 메서드는 자동 생성되지 않음
	public BookVO() {
		// 초기화 작업
		// this 생략 가능
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	
	// 생성자 메서드의 중복정의(overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

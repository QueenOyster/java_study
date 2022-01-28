import java.util.*;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// Generic - <BookDTO> 만 넣겠다
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] --> BookDTO[]
		list.add(new BookDTO("자바", 12000, "이지스", 600)); 
		list.add(new BookDTO("C언어", 17000, "에이콘", 700)); // ArrayList: 길이 자동 증가
		list.add(new BookDTO("python", 15000, "제이펍", 690));

		for (int i=0;i<list.size(); i++) {
			// Object o = list.get(i); 업캐스팅 필요x, 보통 한가지 데이터타입만 넣고 뺌
			// BookDTO vo = (BookDTO)list.get(i); 자기타입으로 나오니까 다운캐스팅 필요 x
			BookDTO vo = list.get(i);
			System.out.print(vo.title + "\t");
			System.out.print(vo.price + "\t");
			System.out.print(vo.company + "\t");
			System.out.println(vo.page);
		}
	}

}
import java.util.*;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// Generic - <BookDTO> �� �ְڴ�
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] --> BookDTO[]
		list.add(new BookDTO("�ڹ�", 12000, "������", 600)); 
		list.add(new BookDTO("C���", 17000, "������", 700)); // ArrayList: ���� �ڵ� ����
		list.add(new BookDTO("python", 15000, "������", 690));

		for (int i=0;i<list.size(); i++) {
			// Object o = list.get(i); ��ĳ���� �ʿ�x, ���� �Ѱ��� ������Ÿ�Ը� �ְ� ��
			// BookDTO vo = (BookDTO)list.get(i); �ڱ�Ÿ������ �����ϱ� �ٿ�ĳ���� �ʿ� x
			BookDTO vo = list.get(i);
			System.out.print(vo.title + "\t");
			System.out.print(vo.price + "\t");
			System.out.print(vo.company + "\t");
			System.out.println(vo.page);
		}
	}

}
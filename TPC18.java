
//import java.lang.*; -> (Default Package) -> ���� ����
import kr.tpc.*;
import com.google.gson.Gson;

public class TPC18 {

	public static void main(String[] args) {
		// 1. Java���� �������ִ� Class�� (API)
		// ���ڿ�(String)
		String str = new String("APPLE"); // (java.lang.) ���� ����
		System.out.println(str.toLowerCase()); // apple

		// 2. ���� ���� ����ϴ� Class�� (DTO/VO, DAO, Utility .. API)
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);

		// 3. �ٸ� ȸ�翡�� ����� ���� Class�� (API)
		// mvnrepository: Gson -> json
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		Gson g = new Gson();
		String json = g.toJson(vo);
		System.out.println(json); // {"title":"�ڹ�","price":13000,"company":"����","page":800}
	}

}

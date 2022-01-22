
//import java.lang.*; -> (Default Package) -> 생략 가능
import kr.tpc.*;
import com.google.gson.Gson;

public class TPC18 {

	public static void main(String[] args) {
		// 1. Java에서 제공해주는 Class들 (API)
		// 문자열(String)
		String str = new String("APPLE"); // (java.lang.) 생략 가능
		System.out.println(str.toLowerCase()); // apple

		// 2. 직접 만들어서 사용하는 Class들 (DTO/VO, DAO, Utility .. API)
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);

		// 3. 다른 회사에서 만들어 놓은 Class들 (API)
		// mvnrepository: Gson -> json
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		Gson g = new Gson();
		String json = g.toJson(vo);
		System.out.println(json); // {"title":"자바","price":13000,"company":"영진","page":800}
	}

}

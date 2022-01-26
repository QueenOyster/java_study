import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

	public static void main(String[] args) {
		// Oracle, MySQL -> Driver Class 다운로드(jar 압축파일로 배포) -> 자바 제공 인터페이스 -> Driver 속 method 이용 -> CRUD
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");

		conn = new JavaMySQL();
		conn.getConnection("url", "root", "abcde");

	}

}

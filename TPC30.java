import kr.tpc.*;

public class TPC30 {

	public static void main(String[] args) {
		// A, B 클래스를 저장 할 배열
		Object[] o = new Object[2]; // 다형성 배열
		o[0] = new A();
		o[1] = new B();

		for (int i = 0; i < o.length; i++) {
			if (o[i] instanceof A) {
				((A) o[i]).go();
			} else {
				((B) o[i]).go();
			}
		}

		pringGo(o);
	}

	private static void pringGo(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (o[i] instanceof A) {
				((A) o[i]).go();
			} else {
				((B) o[i]).go();
			}

		}
	}
}
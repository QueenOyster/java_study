package kr.inflearn;

// public(외부 접근도 허용) 생략되면 default의 '의미'(Package 내부 접근 허용, 외부 금지), default가 public 아님! 
public class MyClass {
	public int sum(int a, int b) { // 메서드는 변수이다 (sum에 hap을 넣어 돌려줌)
		int hap = 0;
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}

}

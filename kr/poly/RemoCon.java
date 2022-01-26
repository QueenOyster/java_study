package kr.poly;

public interface RemoCon {// 자체로 객체생성 X RemoCon r = new RemoCon(); X

	// 상수 사용 가능
	int MAXCH = 100; // (public static final, Italic)
	int MINCH = 1; // RemoCon.MINCH O (∵ static 키워드)

	// 추상 메서드
	public abstract void chUp(); // interface 기입시 => (abstract)

	public void chDown();

	public void internet();
}

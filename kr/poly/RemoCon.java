package kr.poly;

public interface RemoCon {// ��ü�� ��ü���� X RemoCon r = new RemoCon(); X

	// ��� ��� ����
	int MAXCH = 100; // (public static final, Italic)
	int MINCH = 1; // RemoCon.MINCH O (�� static Ű����)

	// �߻� �޼���
	public abstract void chUp(); // interface ���Խ� => (abstract)

	public void chDown();

	public void internet();
}

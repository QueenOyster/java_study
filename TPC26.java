import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon() X
		/* �߻�Ŭ���� vs �������̽�
		 * ������: ������ ����, ��ü ���� �Ұ�, ����Ŭ������ ���� �����Ǿ����, �θ��ǿ��ҷ� ���, �߻�޼��带 ����
		 * �߻�Ŭ����: ���� ����� ����� Ŭ������ ����κ��� ���� �� ���, ���� �޼���� �߻� �޼��带 �Բ� ���� �� ����.
		 * �������̽�: ���� ����� �ٸ� Ŭ������ ����κ��� ���� �� ���, 100% �߻� �޼���, ���� �޼��� X, ���� ��� O, final static O 
		 */
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		// Message Polymorphism
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}

}

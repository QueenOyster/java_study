import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		// RemoCon r = new RemoCon() X
		/* �߻�Ŭ���� vs �������̽�
		 * ������: ������ ����
		 * ������: ��ü Ÿ�� ��ü ���� ���ɿ���
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

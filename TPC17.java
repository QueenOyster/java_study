import kr.tpc.MovieVO;

public class TPC17 {

	public static void main(String[] args) {
		// Array has same type data
		// 3 ways to create array
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		int[] b = { 10, 20, 30, 40, 50 };
		int[] c = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("------------------------------");

		// Class can make array that has different type data
		MovieVO mv = new MovieVO("��Ʈ", 12000, "������", 12, 1.3f);
		System.out.println(mv.toString());
		System.out.println("------------------------------");

		// Array which has same type objects
		MovieVO[] mv_arr = new MovieVO[3];
		mv_arr[0] = new MovieVO("��Ʈ1", 12000, "������1", 12, 1.3f);
		mv_arr[1] = new MovieVO("��Ʈ2", 13000, "������2", 11, 1.4f);
		mv_arr[2] = new MovieVO("��Ʈ3", 11000, "������3", 13, 1.5f);
		System.out.println(mv_arr[0].toString());
		System.out.println(mv_arr[1].toString());
		System.out.println(mv_arr[2]);// (.toString())

	}

}

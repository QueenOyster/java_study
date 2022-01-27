// import java.lang.*; -> Default

public class TPC34 {
	public static void main(String[] args) {

		// java.lang.String.class -> Copy Qualified Name
		String str = new String("APPLE"); // (java.lang.)String
		String v = str.toLowerCase();

		System.out.println(v); // apple
		// System.out.println(str); // APPLE

		// practice
		System.out.println(str.charAt(3)); // A P P "L"...
		System.out.println(str.length()); // 5
		System.out.println(str.indexOf("PL")); // 2 ,start position
		System.out.println(str.indexOf("PX")); // -1, fail
		System.out.println(str.replaceAll("P", "X")); // AXXLE

	}
}

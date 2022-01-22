package kr.tpc;

public class OverLoad {// method(µø¿€) only class
	
	public void hap(int a, int b) {// hap_int_int
		// Computer memorizes all method's name differently 
		// even if it looks like have same name to human.
		System.out.println(a + b);
	}

	public void hap(float a, int b) {// hap_float_int
		System.out.println(a + b);
	}

	public void hap(float a, float b) {// hap_float_float
		System.out.println(a + b);
	}

}

import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		
		/* How to access instance methods
		 * 1 Create object
		 * Inflearn inf = new Inflearn(); (valid only when Constructor != private)
		 * 2 Call Methods
		 * inf.tpc();
		 */
		
		
		/* How to access class methods
		 * 1 Call Methods without creating object
		 * Inflearn.java()
		 * 
		 * Creating Object is not needed.
		 * inf.java(); access ERROR
		 */
				
		/* If class has private constructor
		* all method should be "static" else can't access
		* used when creating object is not needed
		* ex) Java API
		* System sys = new System(); not visible ERROR
		* System.out.println("Output"); 
		* Math m = new Math(); not visible ERROR
		* int v = Math.max(10, 20);
		* System.out.println(v);
		*/
	}

}

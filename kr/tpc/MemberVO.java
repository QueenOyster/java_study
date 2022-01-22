package kr.tpc;

public class MemberVO {

	// 1. Information hiding
	// use "private"
	// -> protect field in Object
	private String name;
	private int age;
	private String tel;
	private String addr;

	// 2-1 Type Default Constructor
	public MemberVO() {
	}

	// 2-2 Define Overloaded Constructor and set Initial Values
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// 3. generate Setter, Getter method
	// setter method
	// -> determinate validity, Dependency Injection
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 4. use toString() method for Debugging
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

}

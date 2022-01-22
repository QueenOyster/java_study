package kr.tpc;

public class MovieVO {
	// 1. Information Hiding
	private String title;
	private int price;
	private String author;
	private int level;
	private float time;

	// 2-1. Default Construct
	public MovieVO() {
	}

	// 2-2. Overloading Construct
	public MovieVO(String title, int price, String author, int level, float time) {
		// super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.level = level;
		this.time = time;
	}

	// 3. Setter and Getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	// 4. toString
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	}

}

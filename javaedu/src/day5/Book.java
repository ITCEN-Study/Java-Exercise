package day5;

public class Book {
	String title;
	String author;
	int price;

	public Book() {
		this("자바의 정석", "남궁성", 3000);
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getBookInfo() {
		return title + "\t" + author + "\t" + price;
	}

	public int getPrice() {
		return price;
	}
}
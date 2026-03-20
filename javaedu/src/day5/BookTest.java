package day5;

class Book {
	String title;
	String author;
	int price;
	
	Book() {
		this.title = "자바의 정석";
		this.author = "남궁성";
		this.price = 3000;
	}
	
	Book(String title, String author, int price) {
		this.title =title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return title + "\t" + author + "\t" + price;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book(); // 기본 생성자 호출
		Book b2 = new Book("파이썬 기초", "강길동", 25000);
		Book b3 = new Book("HTML/CSS", "김철수", 18000);
		Book b4 = new Book("데이터베이스", "이영희", 32000);
		Book b5 = new Book("Spring Boot", "박민수", 35000);

		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	}

}

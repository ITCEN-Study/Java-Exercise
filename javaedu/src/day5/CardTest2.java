package day5;

class Card{	
	public String kind ;		// 카드의 무늬 - 인스턴스 변수
	int number;		// 카드의 숫자 - 인스턴스 변수
	static int width = 100;	// 카드의 폭   - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수	
}

public class CardTest2{
	public static void main(String args[]) throws Exception{	
		System.out.println("CardTest 수행이 시작었습니다.");
		Thread.sleep(10000);
		Card c1 = new Card();		
		c1.kind = "Heart";
		c1.number = 7;	
		System.out.println("첫 번째 Card 객체가 생성됨");
		Thread.sleep(10000);
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("두 번째 Card 객체가 생성됨");
		Thread.sleep(5000);
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");	
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
}





package day4;

public class MethodLab1 {

	public static void main(String[] args) {
		System.out.print("좋아하는 음식은 : ");
		printMyFood();
		System.out.println("입니다." );
		
		
		System.out.print("좋아하는 숫자는 : " + getMyNumber() + " 입니다.");
	}

	static void printMyFood() {
		System.out.print("김치볶음밥");
		return;
	}
	
	static int getMyNumber() {
		return 99;
	}
}

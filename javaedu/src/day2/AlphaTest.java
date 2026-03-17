package day2;

public class AlphaTest {

	public static void main(String[] args) {
		int num = (int) (Math.random()*26)+1;
		
		char alphabet = (char)(num + 64);
		
		System.out.printf("추출된 숫자 : %d\n", num);
		System.out.println(alphabet);
	}

}

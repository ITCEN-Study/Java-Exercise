package day2;

public class ForLab8 {

	public static void main(String[] args) {
		final char STAR = '*' ;
		
		for(int i = 7; i>=1; i--) {
			for (int j =1; j<=i; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}

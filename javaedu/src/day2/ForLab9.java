package day2;

public class ForLab9 {

	public static void main(String[] args) {
		final char STAR = '*' ;
		
		for(int i = 1; i<=5; i++) {
			for (int k = 0; k < i; k++) {
                System.out.print(" "); 
            }
			for (int j =1; j<=10; j++) {
				System.out.print(STAR);
			}
			System.out.println();
		}
	}

}

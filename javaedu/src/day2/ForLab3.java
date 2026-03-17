package day2;

public class ForLab3 {

	public static void main(String[] args) {
		for (int num = 9; num > 3; num-=1) {
			if (num % 2 == 0) {
				System.out.println(num + " : 짝수");
			}
			else {
				System.out.println(num + " : 홀수");
			}
		}
	}

}

package day2;

public class ForLab5 {

	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNum+=i;
			}
			else {
				oddNum += i;
			}
		}
		System.out.print("1부터 100까지의 숫자들 중에서" + "\n" + "짝수의 합은" + evenNum + "이고" + "\n" + 
				"홀수의 합은 " +oddNum + " 이다");
	}

}

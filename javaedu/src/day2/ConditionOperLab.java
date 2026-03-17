package day2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int score = (int) (Math.random()*5) + 1;
		int result = 0;
		
		if (score == 1) {
            result = 300 + 50;
	}
		else if (score == 2) {
			result = 300 - 50;
		}
		
		else if (score == 3) {
			result = 300 * 50;
		}
		else if (score == 4) {
			result = 300 / 50;
		}
		else if (score == 3) {
			result = 300 % 50;
		}

		System.out.println("결과값 : " + result);
	}
}

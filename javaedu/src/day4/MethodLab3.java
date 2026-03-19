package day4;

public class MethodLab3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * 30) + 1;
            int b = (int) (Math.random() * 30) + 1;
            int result = getMinus(a, b);
            System.out.println(a + " 와 " + b + " 의 차는 " + result + " 입니다.");
        }
	}

	static int getMinus(int num1, int num2) {
		if (num1 > num2) {
			return num1 - num2;
		}
		else if (num1 < num2) {
			return num2 - num1;
		}
		else {
			return 0;
		}
	}
}

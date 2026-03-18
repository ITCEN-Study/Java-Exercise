package day3;

public class ArrayLab4 {
	public static void main(String[] args) {
		int arraySize = (int) (Math.random() * 6) + 5;

		int[] intArr = new int[arraySize];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 26) + 1;
		}

		char[] charArr = new char[arraySize];

		for (int i = 0; i < intArr.length; i++) {
			charArr[i] = (char) (intArr[i] + 96);
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
			if (i < intArr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();

		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i]);
			if (i < charArr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}
}

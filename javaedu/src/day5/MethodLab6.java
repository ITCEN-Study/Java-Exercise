package day5;

public class MethodLab6 {

	public static void main(String[] args) {
		int[] result2 = powerArray(2);
		printArray(result2);
		
		int[] result3 = powerArray(3);
		printArray(result3);
		
		int[] result4 = powerArray(4);
		printArray(result4);
	}

	static int[] powerArray(int n) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i +1) * n;
		}
		return arr;
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if (i < arr.length - 1) {
				System.out.print(",");
			}
		}
			System.out.println();
		}
}

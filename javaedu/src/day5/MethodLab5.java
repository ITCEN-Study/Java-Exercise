package day5;

public class MethodLab5 {
	
	public static void main(String[] args) {
		// 배열1
		int[] arr1 = {10, 20, 30};
		int result1 = maxNumArray(arr1);
		System.out.println("가장 큰 값은 " + result1 + " 입니다.");
		
		// 배열1
		int[] arr2 = {100, 500, 300, 200, 400};
		int result2 = maxNumArray(arr2);
		System.out.println("가장 큰 값은 " + result2 + " 입니다.");
				
		// 배열1
		int[] arr3 = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		int result3 = maxNumArray(arr3);
		System.out.println("가장 큰 값은 " + result3 + " 입니다.");
	}
	
	static int maxNumArray(int[] nums) {
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		
		return max;
	}
}

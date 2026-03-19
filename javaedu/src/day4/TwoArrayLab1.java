package day4;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		int[][] nums = new int[4][4];
		
		int value = 10;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = value;
                value += 2;
            }
        }
        System.out.println("1행 1열의 데이터 : " + nums[0][0]);
        System.out.println("3행 4열의 데이터 : " + nums[2][3]);
        System.out.println("행의 갯수 : " + nums.length);
        System.out.println("열의 갯수 : " + nums[0].length);
        
        System.out.println("3행의 데이터들 : ");
        for (int j = 0; j < nums[2].length; j++) {
        	System.out.print(nums[2][j] + (j == nums[2].length - 1 ? "" : " "));
        }
        System.out.println();
        
        System.out.println("2열의 데이터들 : ");
        for (int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i][2] + (i == nums.length - 1 ? "" : " "));
        }
        System.out.println();
        
        System.out.println("왼쪽 대각선 데이터들 : ");
        for (int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i][i] + (i == nums.length - 1 ? "" : " "));
        }
        System.out.println();
        
        System.out.println("오른쪽 대각선 데이터들 : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i][nums.length - 1 - i] + (i == nums.length - 1 ? "" : " "));
        }
        System.out.println();
	}
}
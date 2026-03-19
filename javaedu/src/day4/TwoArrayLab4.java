package day4;

public class TwoArrayLab4 {
    public static void main(String[] args) {
        int[][] nums = {
            {10, 20, 30, 40, 50},
            {5, 10, 15},
            {11, 22, 33, 44},
            {9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        for (int i = 0; i < nums.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                rowSum += nums[i][j];
            }
            System.out.println((i + 1) + "행의 합은 " + rowSum + " 입니다.");
        }
    }
}

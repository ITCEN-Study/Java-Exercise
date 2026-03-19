package day4;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int gameTime[][] = {{5, 2, 1, 0, 2, 3, 6},
				{4, 3, 2, 1, 1, 0, 5},
				{3, 1, 2, 1, 3, 1, 3},
				{4, 3, 1, 0, 4, 2, 7}};
		
		int[] daySums = new int[7];
        String[] dayNames = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 4; i++) {
                daySums[j] += gameTime[i][j];
            }
        }

        for (int i = 0; i < daySums.length; i++) {
            System.out.println(dayNames[i] + " : " + daySums[i] + "시간");
        }
        System.out.println();

        int[] weekSums = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                weekSums[i] += gameTime[i][j];
            }
        }

        for (int i = 0; i < weekSums.length; i++) {
            System.out.println((i + 1) + "주차 : " + weekSums[i] + "시간");
        }
		
	}

}

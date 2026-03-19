package day4;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		int[][] twoA = { {'B', 'C', 'A', 'B'}, 
	              {'C', 'C', 'B', 'B'}, 
	              {'D', 'A', 'A', 'D'}, };
		
		int[] counts = new int[4];
		
		for (int i = 0; i < twoA.length; i++) {
			for (int j = 0; j < twoA.length; j++) {
				char ch = (char) twoA[i][j];
				
				if (ch == 'A') {
					counts[0]++;
				}
				else if (ch == 'B') {
					counts[1]++;
				}
				else if (ch == 'C') {
					counts[2]++;
				}
				else if (ch == 'D') {
					counts[3]++;
				}
			}
		}
		System.out.println("A 는 " + counts[0] + "개 입니다.");
        System.out.println("B 는 " + counts[1] + "개 입니다.");
        System.out.println("C 는 " + counts[2] + "개 입니다.");
        System.out.println("D 는 " + counts[3] + "개 입니다.");
	}

}

package day3;

public class ControlLab1 {

	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			if (i % 3 == 0 || i % 4 == 0 ) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}

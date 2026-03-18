package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 5;
		
		for (int i=1; i<=num; i++) {
			System.out.println(i + "->" + i * i);
		}
		
		int count = 1;
		while (count <= num) {
			System.out.println(count + "->" + count * count);
			count ++;
		}
	}

}

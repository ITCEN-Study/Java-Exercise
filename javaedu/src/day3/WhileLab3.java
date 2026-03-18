package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		int count = 0;
		
		while (true) {
			System.out.println("[수행시작]");
			
			int num = (int)(Math.random()*31);
			
			if (num == 0 || 27<=num) {
				break;
			}
			
			char alphabet = (char)(num + 64);
			
			int asciiCode = num +64;
			
			String hexString = Integer.toHexString(asciiCode);
			
			System.out.printf("%d-%c, %d, 0x%s\n", num, alphabet, asciiCode, hexString);
			
			count++;
		}
		System.out.println("[수행종료] - 출력횟수는 " + count + "번");
	}

}

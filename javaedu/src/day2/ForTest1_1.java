package day2;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num;
		for(num=1; num <= 10; num++)
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num);  // 11 출력 -> 증가 된 상태에서 조건이 거짓이 되므로 빠져나온다.
	}
}

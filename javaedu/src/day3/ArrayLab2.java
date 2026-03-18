package day3;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		
		for(int i=0; i < ary.length; i++) {
			ary[i] = (int)(Math.random()*17) + 4;
		}
		int sum = 0;
		
		System.out.print("모든 원소의 값 : ");
		for(int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
			sum += ary[i];
			
			if(i < ary.length -1) {
				System.out.print(',');
			}
		}
		
		System.out.println();
		
		System.out.print("모든 원소의 합 : " + sum);
	}

}

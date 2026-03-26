package day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetLab {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Random rd = new Random();
		
		while(set.size() < 10) {
			int num = rd.nextInt(21) + 10;
			set.add(num);
		}
		
		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + (it.hasNext() ? ", " : ""));
		}
	}

}

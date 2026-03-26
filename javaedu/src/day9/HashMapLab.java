package day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLab {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(map.size() < 5) {
			System.out.println("나라이름을 입력하세요 : ");
			String country = sc.next();
			System.out.println("인구 수를 입력하세요 : ");
			int population = sc.nextInt();
			
			if (map.containsKey(country)) {
				System.out.println("*나라명 " + country + "는 이미 저장되었습니다.*");
			}
			else {
				map.put(country, population);
				System.out.println("*저장되었습니다.*");
			}
		}
		System.out.println("\n5개가 모두 입력되었습니다.");
        System.out.print("입력된 데이터 : ");
        
        int count = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        	count++;
        	if (count < map.size()) {
        		System.out.print(", ");
        	}
        }
        
		sc.close();
	}
}


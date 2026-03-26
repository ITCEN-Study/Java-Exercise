package day9;

import java.util.LinkedList;

class Friend {
	private String name;
	private String phone;
	private String email;
	
	Friend(String name,  String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getInfo() {
		return name + "\t" + phone + "\t" + email;
	}
}

public class LinkedListLab {
	public static void main(String[] args) {
		LinkedList<Friend> friends = new LinkedList<>();
		
		friends.add(new Friend("김댕댕", "010-1234-5678", "abc@123.com"));
		friends.add(new Friend("이댕댕", "010-4321-5678", "def@123.com"));
		friends.add(new Friend("박댕댕", "010-1111-2222", "ghi@123.com"));
		friends.add(new Friend("조댕댕", "010-3333-4444", "jkl@123.com"));
		friends.add(new Friend("심댕댕", "010-8888-7777", "mop@123.com"));
		
		System.out.println("이름\t전화번호\t메일주소");
		
		for (Friend f : friends) {
            System.out.println(f.getInfo());
        }
	}

}

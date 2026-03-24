package day7;



public class FriendTest {
	public static void main(String[] args) {
		Friend[] friends = new Friend[5];
		
		friends[0] = new Friend("김댕댕", "010-1234-5678", "abc@123.com");
		friends[1] = new Friend("이댕댕", "010-4321-5678", "def@123.com");
		friends[2] = new Friend("박댕댕", "010-1111-2222", "ghi@123.com");
		friends[3] = new Friend("조댕댕", "010-3333-4444", "jkl@123.com");
		friends[4] = new Friend("심댕댕", "010-8888-7777", "mop@123.com");
		
		System.out.println("이름\t전화번호\t메일주소");
		
		for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i].getInfo());
        }
	}

}

package day5;

class Member {
	String name;
	String account;
	String passwd;
	int birthyear;
}

public class MemberTest {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "김댕댕";
		m1.account = "abc123";
		m1.passwd = "1234";
		m1.birthyear = 1999;
		
		Member m2 = new Member();
		m2.name = "박댕댕";
		m2.account = "abc456";
		m2.passwd = "4567";
		m2.birthyear = 1998;
		
		Member m3 = new Member();
		m3.name = "이댕댕";
		m3.account = "abc789";
		m3.passwd = "8910";
		m3.birthyear = 1997;
		
		System.out.printf("회원 : %s(%s,%s,%d)", m1.name, m1.account, m1.passwd, m1.birthyear);
		System.out.println();
		System.out.printf("회원 : %s(%s,%s,%d)", m2.name, m2.account, m2.passwd, m2.birthyear);
		System.out.println();
		System.out.printf("회원 : %s(%s,%s,%d)", m3.name, m3.account, m3.passwd, m3.birthyear);
		System.out.println();
	}

}

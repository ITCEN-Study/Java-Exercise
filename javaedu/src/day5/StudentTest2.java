package day5;

class Student2 {
	String name;
	int age;
	String subject;
	
	Student2() {
		System.out.println("매개변수 없는 생성자 호출");
		name = "도우너";
		age = 12;
		subject = "자바스크립트";
	}
	
	Student2 (String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	void printStudentInfo() {
		System.out.println("학생의 이름 :  "+name+",  나이 : " +age);
	}
	
	void study() {
		System.out.println(name+"은(는) "+subject+"를 학습해요");
	}
}

public class StudentTest2 {
	public static void main(String[] args) {
		Student2 st1 = new Student2("둘리", 11, "자바");
//		st1.name = "둘리";
//		st1.age = 11;
//		st1.subject = "자바";
		Student2 st2 = new Student2("또치", 10, "파이썬");
//		st2.name = "또치";
//		st2.age = 10;
//		st2.subject = "파이썬";
		Student2 st3 = new Student2();
		st3.name = "도우너";
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		st1.study();
		st2.study();
		st3.study();
		st3 = st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		st1.study();
		st2.study();
		st3.study();
	}

}

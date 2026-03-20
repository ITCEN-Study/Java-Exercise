package day5;

class Student {
	String name;
	int age;
	String subject;
	
	void printStudentInfo() {
		System.out.println("학생의 이름 :  "+name+",  나이 : " +age);
	}
	
	void study() {
		System.out.println(name+"은(는) "+subject+"를 학습해요");
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "둘리";
		st1.age = 11;
		st1.subject = "자바";
		Student st2 = new Student();
		st2.name = "또치";
		st2.age = 10;
		st2.subject = "파이썬";
		Student st3 = new Student();
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

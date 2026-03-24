package day7;

class Parent {	
	void printInfo() {
		System.out.println("부모입니다");
	}	
}

class Child extends Parent {
	void printInfo() {
		super.printInfo();
		System.out.println("자식입니다");
	}	
	public String toString() {
		return "Child 객체입니다";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.printInfo();
		System.out.println(obj.toString());
		System.out.println(obj);	
	}
}

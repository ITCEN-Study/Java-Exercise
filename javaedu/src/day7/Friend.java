package day7;

class Person {
    private String name;
    
    Person(String name) {
        this.name = name;
    }
    
    public String getInfo() {
        return name;
    }
}

class Friend extends Person {
	private String phoneNum;
	private String email;
	
	Friend (String name, String phoneNum, String email) {
        super(name); // 부모 클래스의 생성자 호출
        this.phoneNum = phoneNum;
        this.email = email;
    }
	
	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;
	}
}

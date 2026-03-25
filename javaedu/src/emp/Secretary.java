package emp;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary()  * 0.1; // 세금을 리턴한다. salary에 10% 징수
	}
	public void  incentive(int pay) {
		// 인센티브 pay의 80%
		setSalary(getSalary() + (int)(pay * 0.8));
	}
}

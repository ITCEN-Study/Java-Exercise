package emp;

public class Company {
	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		
		emp[0] = new Secretary("Duke", 1, "secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "sales", 1200);
		
		printEmployee(emp,false);
		
		System.out.println("\n[인센티브 100 지급]");
        for (Employee e : emp) {
            if (e instanceof Bonus) {
                ((Bonus) e).incentive(100);
            }
        }
        
        printEmployee(emp,false);
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) {
		String header = "name\t\tdepartment\tsalary";
        if (isTax) header += "\ttax";
        header += "\textra pay";
        System.out.println(header);
        System.out.println("--------------------------------------------------------------------");

        for (Employee e : emp) {
            String row = e.getName() + "\t\t" + e.getDepartment() + "\t" + e.getSalary();
            if (isTax) {
                row += "\t" + e.tax();
            }
            
            if (e instanceof Sales) {
                row += "\t" + ((Sales) e).getExtraPay();
            }
            System.out.println(row);
		 }
}
}

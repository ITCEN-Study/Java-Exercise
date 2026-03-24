package day7;



public class GuGuDanApp {
	public static void main(String[] args) {
		int dan = day4.MethodLab4.getRandom(1, 20);
        int number = day4.MethodLab4.getRandom(1, 20);
        
        
        if (dan >=1 && dan <=9 && number >=1 && number <= 9) {
        	System.out.print(dan + "*" + number + "=");
        	GuGuDanExpr gge = new GuGuDanExpr(dan, number);
        	gge.printPart();
        }
        
        else if (dan >=1 && dan <= 9 && number >=10) {
        	System.out.print(dan + "단 : ");
            GuGuDanExpr gge = new GuGuDanExpr(dan);
            gge.printPart();
        }
        
        else if (dan >= 10) {
            System.out.println("1단부터 9단까지 전체 출력: ");
            GuGuDanExpr.printAll();
	}
	}
}

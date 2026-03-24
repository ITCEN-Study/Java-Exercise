package day7;

public class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {
		super();
	}
	
	GuGuDanExpr(int dan) {
		super(dan);
	}
	
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}
	
	public static void printAll() {
        for (int dan = 1; dan <= 9; dan++) {
            for (int n = 1; n <= 9; n++) {
                System.out.print(dan + "*" + n + "=" + (dan * n) + "\t");
            }
            System.out.println();
        }
    }
}

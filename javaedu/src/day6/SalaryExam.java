package day6;
class SalaryExpr {
    int bonus;

    SalaryExpr() {
        this.bonus = 0;
    }

    SalaryExpr(int bonus) {
        this.bonus = bonus;
    }

    int getSalary(int grade) {
        if (grade == 1) {
            return this.bonus + 100;
        } else if (grade == 2) {
            return this.bonus + 90;
        } else if (grade == 3) {
            return this.bonus + 80;
        } else if (grade == 4) {
            return this.bonus + 70;
        }
        return 0; 
    }
}

public class SalaryExam {
    public static void main(String[] args) {
        int month = (int)(Math.random() * 12) + 1; 
        int grade = (int)(Math.random() * 4) + 1;  

        SalaryExpr expr; 

        if (month % 2 == 0) {
            expr = new SalaryExpr(100);
        } else {
            expr = new SalaryExpr();
        }

        int totalSalary = expr.getSalary(grade);

        System.out.printf("%d 월 %d 등급의 월급은 %d 입니다.\n", month, grade, totalSalary);
    }
}
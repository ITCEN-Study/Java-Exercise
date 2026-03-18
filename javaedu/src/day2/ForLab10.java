package day2;

public class ForLab10 {

    public static void main(String[] args) {
        
        int randomNum = (int)(Math.random() * 2) + 1;
        
        int start = randomNum; 

        for (int i = start; i <= 9; i += 2) {
            
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
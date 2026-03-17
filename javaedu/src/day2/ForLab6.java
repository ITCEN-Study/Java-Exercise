package day2;

public class ForLab6 {
    public static void main(String[] args) {
        int count = (int)(Math.random() * 8) + 3;
        int symbolType = (int)(Math.random() * 3) + 1;
        
        char symbol = ' ';

        if (symbolType == 1) {
            symbol = '*';
        } else if (symbolType == 2) {
            symbol = '$';
        } else {
            symbol = '#';
        }

        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
        
        System.out.println();
    }
}

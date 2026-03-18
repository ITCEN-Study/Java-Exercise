package day3;

public class LottoMachine1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.random() * 45) + 1;

            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    isDuplicate = true;
                    break; // 중복 발견!
                }
            }

            if (isDuplicate) {
                i--;
            } else {
                lotto[i] = num;
            }
        }

        System.out.print("오늘의 로또 번호 - ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i]);
            if (i < lotto.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

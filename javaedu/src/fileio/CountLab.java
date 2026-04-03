package fileio;

import java.io.*;

public class CountLab {
    public static void main(String[] args) {
        String filePath = "c:/iotest/yesterday.txt";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                    
                    if (cleanWord.equals("yesterday")) {
                        count++;
                    }
                }
            }
            System.out.println("yesterday 라는 단어는 " + count + "개 있습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }
}
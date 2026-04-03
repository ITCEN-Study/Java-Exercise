package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyLab {
    public static void main(String[] args) {
        String sourcePath = "c:/iotest/sample.txt";
        String targetPath = "c:/iotest/sample_new.txt";

       
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath, true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }
            
            System.out.println("저장 완료되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("sample.txt 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
        }
    }
}
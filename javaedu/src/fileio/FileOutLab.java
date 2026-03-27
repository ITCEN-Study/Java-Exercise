package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab {
	public static void main(String[] args) {
		File dir = new File("c:/iolab");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("c:/iolab/event.txt"))) {
			String dayAug15 = getDayOfWeek(2026, 8, 15);
			String dayDec25 = getDayOfWeek(2026, 12, 25);
			
			pw.printf("2026년 8월 15일은 %s요일입니다.\n", dayAug15);
            pw.printf("2026년 12월 25일은 %s요일입니다.\n", dayDec25);
            
            System.out.println("저장이 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}

	private static String getDayOfWeek(int year, int month, int day) {
		LocalDate date = LocalDate.of(year, month, month);
				return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN).replace("요일", "");
	}
}

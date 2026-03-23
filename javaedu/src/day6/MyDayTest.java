package day6;

import java.util.Calendar;
import java.util.GregorianCalendar;

class MyDay {
	static String birthDay;
	static {
		int year = 1999;
		int month = 12;
		int day = 25;
		
		GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
		
		// 요일 정보
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] days = {"", "일", "월", "화", "수", "목", "금", "토"};
		birthDay = days[dayofweek] + "요일";
		}
	}

public class MyDayTest {
	public static void main(String[] args) {
		String nickname = "이재혁";
		
		System.out.println(nickname + " 는 " + MyDay.birthDay + "에 태어났어요");
	}

}

package day10;

import java.io.InputStreamReader;

public class StandardInputTest2 {

	public static void main(String[] args) throws Exception {
		System.out.print("입력 : ");
		int input = new InputStreamReader(System.in).read();	// 바이트 스트림 객체를 문자 스트림 객체로 바꿔준다
		System.out.println("입력된 문자 : " + (char)input);
	}

}

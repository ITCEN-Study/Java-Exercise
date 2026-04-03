package day10;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) {
		try {
			URL req = new URI("https://image.zdnet.co.kr/2020/09/17/b365913d4f34474aae929998100791ad.jpg").toURL();
			InputStream is = req.openStream();
			FileOutputStream fos = new FileOutputStream("test.jpg");
			int data;
			while (true) {
				data = is.read();
				if (data == -1)
					break;
				fos.write(data);
			}
			System.out.println("파일에 저장완료~");
			fos.close();
		}catch (Exception e) {
				System.out.println("오류 : " + e.getMessage());
			}
		}
	}

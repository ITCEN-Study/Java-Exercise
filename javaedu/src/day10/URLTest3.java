package day10;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class URLTest3 {
	public static void main(String[] args) {
		try {
			URL req = new URI("").toURL();
			InputStream is = req.openStream();
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			Scanner scan = new Scanner(is);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}catch (Exception e) {
				System.out.println("오류 : " + e.getMessage());
			}
		}
	}

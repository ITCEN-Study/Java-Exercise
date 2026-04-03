package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageIOLab {

	public static void main(String[] args) {
		String listFilePath = "c:/iotest/list.txt";
		String saveDir ="c:/iotest/myimage/";
		
		File dir = new File(saveDir);
		if (!dir.exists()) dir.mkdirs();
		
		try (BufferedReader br = new BufferedReader(new FileReader(listFilePath))) {
			String line;
			while((line = br.readLine()) !=null) {
				String[] data = line.split(",");
				if (data.length < 2) continue;
				
				String fileName = data[0].trim() + ".jpg";
				String urlStr = data[1].trim();
				
				try (InputStream is = new URL(urlStr).openStream();
						FileOutputStream fos = new FileOutputStream(saveDir + fileName)) {
					
					byte[] buffer = new byte[1024];
                    int len;
                    while ((len = is.read(buffer)) != -1) {
                        fos.write(buffer, 0, len);
				}
                    System.out.println(fileName + "저장 완료");
			} catch (IOException e) {
				System.out.println(fileName + "오류 : " + e.getMessage());
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}

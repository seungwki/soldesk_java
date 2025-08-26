package chapter22;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream03 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output3")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
			System.out.println("fis03 Print Complete");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

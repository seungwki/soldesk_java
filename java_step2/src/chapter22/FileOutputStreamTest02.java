package chapter22;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("example_0.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
			System.out.println("Print Complete");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
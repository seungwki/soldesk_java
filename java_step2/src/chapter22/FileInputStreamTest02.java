package chapter22;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) {
		// fis는 한글이 깨지므로 FileReader로 바꾸자.
		try (FileReader fr = new FileReader("example.txt")) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			} // 한글은 2바이트, fis는 1바이트 단위로 전송하므로 깨진다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

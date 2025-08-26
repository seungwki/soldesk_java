package chapter22;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("example.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				System.out.println((char) data);
			}//한글은 2바이트, fis는 1바이트 단위로 전송하므로 깨진다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

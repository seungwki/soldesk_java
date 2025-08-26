package chapter22;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("example_0.txt")) {
			for (int i = 0; i < 1000; i++) {
				fos.write(i);
			}
			System.out.println("File write Complete");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
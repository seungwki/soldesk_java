package chapter22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		String fileName = "example_0.txt";
		try {
			// 파일 중복 체크 할 것
			while (new File(fileName).exists()) {
				fileName = fileName.replaceAll(".txt", "_copy.txt");
			}
			FileWriter fw = new FileWriter(fileName);
			for (int i = '가'; i < '힇'; i++) {
				if (i % 20 == 0)
					fw.write('\n');
				fw.write(i);
			} // for
			System.out.println("File writer Complete");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
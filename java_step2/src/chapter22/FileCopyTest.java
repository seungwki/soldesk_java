package chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
	public static void main(String[] args) {
		long milliSecond1 = 0;
		long milliSecond2 = 0;
		try (FileInputStream fis = new FileInputStream("a.zip"); // 읽어서
				FileOutputStream fos = new FileOutputStream("copy.zip")) {// 복사할 예정

			milliSecond1 = System.nanoTime();// 복사 시작 시간
			
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}

			milliSecond2 = System.nanoTime();// 복사 종료 시간
//			milliSecond2 = System.currentTimeMillis();// 복사 종료 시간
			System.out.println(milliSecond2 - milliSecond1);

			System.out.println("copy complete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
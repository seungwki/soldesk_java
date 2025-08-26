package chapter22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest2 {
	public static void main(String[] args) {
		long milliSecond1 = 0;
		long milliSecond2 = 0;
		try (FileInputStream fis = new FileInputStream("a.zip"); // 읽어서
				FileOutputStream fos = new FileOutputStream("copy.zip"); // 복사할 예정
				BufferedInputStream bis = new BufferedInputStream(fis); // 좀 더 빠르게 읽기
				BufferedOutputStream bos = new BufferedOutputStream(fos);// 좀 더 빠르게 쓰기
		) {

			milliSecond1 = System.nanoTime();// 복사 시작 시간

			int i;
			while ((i = fis.read()) != -1) {
				bos.write(i);
			}

			bos.flush();
			milliSecond2 = System.nanoTime();// 복사 종료 시간
//			milliSecond2 = System.currentTimeMillis();// 복사 종료 시간
			System.out.println(milliSecond2 - milliSecond1);

			System.out.println("copy complete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
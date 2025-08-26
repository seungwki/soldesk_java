package chapter22;

import java.io.FileInputStream;
import java.io.InputStreamReader;

// FileInputStream : 기반 스트림. 바이트 단위로 읽기에 한글이 깨진다.
// InputStreamReader : 보조 스트림. 기반 스트림을 보조해서 한글이 깨지지 않도록 한다.
public class InputStreamReaderTest01 {
	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("input.txt"))) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

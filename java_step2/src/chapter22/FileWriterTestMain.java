package chapter22;

import java.io.FileWriter;

public class FileWriterTestMain {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('a');
			char[] buf = { 'B', 'c', 'd', 'E', 'f','q'};
			fw.write(buf);
			fw.write("한글 잘 써지는지 확인");
			fw.write(buf, 2, 4);
			fw.write("65");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Write Complete");
	}
}
package etctest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class KtAnalyzer {
	public static void main(String[] args) {
//		String fileName ="‪C:\\Users\\d\\chat903.txt";
		File file = new File("test.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
		}
	}
}
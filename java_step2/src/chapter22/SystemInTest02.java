package chapter22;

import java.io.IOException;

public class SystemInTest02 {
	public static void main(String[] args) {
		System.out.println("Type alphabets and press [Enter]");
		int i;
		try {
			while ((i = System.in.read()) != -1) {
				if (i == '\r' || i == '\n') {
					continue;
				}
				System.out.print((char) i + " ");
				System.out.println(i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
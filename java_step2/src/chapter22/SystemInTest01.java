package chapter22;

import java.io.IOException;

public class SystemInTest01 {
	public static void main(String[] args) {
		System.out.println("Type a alphabet and press [Enter]");
		int i;
		try {
			i = System.in.read();
			System.out.print(i+" ");
			System.out.println((char) i);
			i = 99999;
			System.out.print(i+" ");
			System.out.println((char) i);
		} catch (IOException e) {e.printStackTrace();}
	}
}
package chapter05;

import java.util.Iterator;

public class ForEach01 {
	public static void main(String[] args) {
		String[] strArr = {"java", "Oracle", "Html", "css", "js", "python"};
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("=============");
		for (String str : strArr) {
			System.out.println(str);
		}
	}
}
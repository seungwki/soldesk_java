package chapter17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest02 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Java");
		strList.add("Oracle");
		strList.add("Jsp");
		strList.add("Python");
		System.out.println("size >> " + strList.size());
		System.out.println("2 >> " + strList.get(2));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("--------------------------");
		strList.add(2, "Spring");
		System.out.println("size >> " + strList.size());
		System.out.println("2 >> " + strList.get(2));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("--------------------------");
		strList.remove(3);
		System.out.println("size >> " + strList.size());
		System.out.println("2 >> " + strList.get(2));
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
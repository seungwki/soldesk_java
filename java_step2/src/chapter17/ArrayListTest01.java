package chapter17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		//길이가 가변
		strList.add("Hello");
		strList.add("world");
		strList.add("defect");
		strList.add("power");
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("=============");
		strList.add(3,"special");
		for (String str : strList) {
			System.out.println(str);
		}
		System.out.println("=============");
		strList.remove(strList.size()-1);
		for (String str : strList) {
			System.out.println(str);
		}
		
	}
}
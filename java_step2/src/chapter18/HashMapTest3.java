package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Student A", 50);
		
		if(!map.containsKey("Student A")) {
			map.put("Student A", 100);
		}
//		else {
//			map.put("Student A", 150);
//		}
		//==.putIfAbsent()
		map.putIfAbsent("Student A", 150);//중복된 key가 존재하므로 value가 덮어씌워지지 않는다.
		map.putIfAbsent("Student B", 150);
		System.out.println(map);
		
		System.out.println("======================");
//		Iterator<String> iter = map.();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	}
}
package chapter18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest4 {
	public static void main(String[] args) {
		// 학생의 이름과 점수
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Student A", 90);
		map.put("Student B", 80);
		map.put("Student C", 80);
		map.put("Student D", 100);
		System.out.println(map);
		System.out.println("D >> " + map.get("Student D"));
		System.out.println("-==== key set 활용 ======");
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.print(key + " : ");
			System.out.println(value);
		}
		System.out.println("-==== entry set 활용 ======");
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = es.iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, Integer> entry = iter2.next();
			System.out.print(map.get(entry.getKey()));
			System.out.print(" , ");
			System.out.println(map.containsValue(entry.getValue()));
		}
		System.out.println("-==== values 활용 ======");
		Collection<Integer> c = map.values();//Value들을 담은 collection을 반환한다.
		System.out.println(c.getClass());//class java.util.HashMap$Values
		System.out.println(c);
		
	}
}
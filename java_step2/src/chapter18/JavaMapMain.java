package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaMapMain {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();//박살이 나고 있으니까
		Map<String, Integer> map2 = new LinkedHashMap<>();//입력 순서 유지
		Map<String, Integer> map3 = new TreeMap<>();//key 기준 오름차순 정렬
		run(map1);
		run(map2);
		run(map3);
		}

	private static void run(Map<String, Integer> map) {
		System.out.println("map >> " + map.getClass().getSimpleName());
		map.put("C", 10);
		map.put("B", 20);
		map.put("A", 30);
		map.put("1", 40);
		map.put("2", 50);
		map.put("34", 60);
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " >> " + map.get(key));
		}
		System.out.println("====================");
	}
}

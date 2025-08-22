package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("엄준식", 1557);
		map.put("엄", 12);
		map.put("살", 14);
		map.put("범", 2);
		System.out.println(map);
		System.out.println("Entity >> " + map.size());

		System.out.println("=====================");
		// key로 value 찾기
		System.out.println("식 >> " + map.get("식"));
		System.out.println("엄 >> " + map.get("엄"));
		System.out.println("=====================");
		// key, value 찾기
		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String temp;
			temp = iter.next();
			System.out.print(temp);
			System.out.print(" >> ");
			System.out.println(map.get(temp));
		}
		System.out.println("=====================");
		map.remove("엄준식");
		System.out.println("Entity >> " + map.size());
		System.out.println("============iter=========");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = entrySet.iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, Integer> iterNext = iter2.next();
			String key = iterNext.getKey();
			Integer value = iterNext.getValue();
			System.out.println(key + "*&*&&*" + value);
		}

		System.out.println("=====================");
		System.out.println(entrySet);// 궁극적으로는 "Set" 그 자체이다. Key와 Value가 묶인 하나의 객체들로 채워진 Set이다.
		System.out.println("=====================");
		map.clear();
		System.out.println("Entity >> " + map.size());
	}
}
package chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//map1, map2에 공통으로 들어간 키를 찾고, 키의 값을 모두 더할 것.
//결과 {B=6, C=8}
public class SumTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("B", 4);
		map2.put("C", 5);
		map2.put("D", 6);

		Map<String, Integer> mapUnion = new TreeMap<String, Integer>();
		//제출
		Set<String> keySet = map1.keySet();
		for (String key : keySet) {
			if (map2.containsKey(key)) {
				mapUnion.put(key, map1.get(key) + map2.get(key));
			}
		}
		//n개의 map에 대응하여 공통 key를 뽑아내도록 하자.
//		HashMap<?,?>[] mapArr = {map1, map2}; //공변과 불공변 참조
		//최초 맵의 keySet을 생성
		//map들을 순회하면서 없는 것들을 제거
		//모든 맵에 대해 체크를 완료하면 diffKeySet이 완성. diffKeySet으로 모든 맵을 통해 값을 추가
		
		//결과
		System.out.println(mapUnion);
	}
}
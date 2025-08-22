package chapter18;

import java.util.HashMap;
import java.util.Map;
public class HashMapTest2 {
	public static void main(String[] args) {
		Map<String, Integer> studentMap = new HashMap<>();
		//학생의 이름과 점수를 추가하겠다
		studentMap.put("A",90);
		studentMap.put("AA",1030);
		studentMap.put("D",124);
		studentMap.put("DD",69);
		System.out.println(studentMap);
		studentMap.put("A",1000);
		System.out.println(studentMap);//같은 키가 있다면 나중의 value로 대체한다.
		
		System.out.println(studentMap.containsKey("AA"));
		System.out.println(studentMap.containsKey("C"));
		
		//학생 value 삭제
		studentMap.remove("AA");
		System.out.println(studentMap);
	}
}
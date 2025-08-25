package chapter18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

//각 단어가 나타난 수 출력
//실행 결과 : {orange=1, banana=2, apple=3}
public class WordTest {
	public static void main(String[] args) {
		String text = "orange banana apple apple banana apple";
		Map<String, Integer> count = new HashMap<String, Integer>();
		StringTokenizer stk = new StringTokenizer(text);
		String word;
		while (stk.hasMoreTokens()) {
			word = stk.nextToken();
			if (!count.containsKey(word)) {
				count.put(word, 1);
			} else {
				count.put(word, count.get(word)+1);
			}
		}
//		Set<String> keySet = count.keySet();
//		Iterator<String> iter = keySet.iterator();
//		System.out.print("{");
//		while(iter.hasNext()) {
//			word = iter.next();
//			System.out.print(word+"="+count.get(word));
//			if(iter.hasNext()) {
//				System.out.print(", ");
//			}
//		}
//		System.out.print("}");
		System.out.println(count);
	}
}
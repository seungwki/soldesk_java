package chapter18;

import java.util.TreeSet;

public class HashTreeTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("홍준식");
		ts.add("김준식");
		ts.add("엄준식");
		ts.add("엄준식");//중복 절 대 안된다~
		for (String s : ts) {
			System.out.println(s);//입력의 순서는 보장되지 않지만, 순서 자체는 자동으로 정렬된다. 이와 같은 특징 덕분에 탐색에 유리하다.
		}
	}
}
package chapter18;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("엄준식1");
		hashSet.add("엄준식3");// 순서 보장 안 됨
		hashSet.add("엄준식1");// 중복 허용 안 됨
		hashSet.add("엄준식2");
		hashSet.add("엄준식4");
		System.out.println(hashSet);
	}
}
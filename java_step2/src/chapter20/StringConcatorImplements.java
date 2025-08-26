package chapter20;

public class StringConcatorImplements implements StringConcator {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	};

}

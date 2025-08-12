package chapter09;

public class StaticTestMain2 {
public static void main(String[] args) {
	StaticTest01 st = new StaticTest01();
	System.out.println(st.str1);
	System.out.println(st.str2);
	System.out.println(StaticTest01.str2);
	
	String s = st.getStatic();
	System.out.println(s);
}
}
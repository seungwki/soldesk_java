package chapter09;

public class DataCountMain2 {
	public static void main(String[] args) {
		Counter c = new Counter();
		Data2 d1 = new Data2("Data 1", c);
		System.out.println(c.count);
		Data2 d2 = new Data2("Data 2", c);
		System.out.println(c.count);
		Data2 d3 = new Data2("Data 3", c);
		System.out.println(c.count);
//		System.out.println(d1.count);
//		Data2 d2 = new Data2("Data 2");
//		System.out.println(d2.count);
//		Data2 d3 = new Data2("Data 3");
//		System.out.println(d3.count);
	}
}
package chapter09;
public class Data2 {
	public String name;
//	public static int count;

	public Data2(String name, Counter counter) {
		this.name = name;
		counter.count++;
	}
	
}

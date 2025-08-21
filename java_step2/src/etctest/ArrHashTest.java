package etctest;

public class ArrHashTest {
	public static void main(String[] args) {
		String[] arr = new String[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf((i+1)*123);
		}
		for (String s : arr) {System.out.println(s);}
		System.out.println("-------------");
		for (String s : arr) {System.out.println(s.hashCode());}
	}
}
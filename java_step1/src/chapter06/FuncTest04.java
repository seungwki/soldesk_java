package chapter06;

public class FuncTest04 {
	public static void main(String[] args) {
		String[] quote;
		quote = new String[] {"ANGELION","SHOREDINGER","FLOWER","SILENT","WONERING"};
		display(quote);
	}
	public static void display(String strArr[]) {
		String result;
		result ="";
		for (int i = 0; i < strArr.length; i++) {
			result += strArr[i]+"\n";
		}
		System.out.println(result);
	}
}
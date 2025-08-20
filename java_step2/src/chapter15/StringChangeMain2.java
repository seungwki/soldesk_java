package chapter15;

public class StringChangeMain2 {
	public static void main(String[] args) {
		String str = "    Java Programming    　";
		System.out.println("To lower case >>> "+str.toLowerCase());
		System.out.println("To upper case >>> "+str.toUpperCase());
		System.out.println("Trim >>> "+str.trim()+",");//ASCII 공백문자만 제거한다.
		System.out.println("Strip >>> "+str.strip()+","); //unicode의 공백문자를 제거한다. 전처리에 좀 더 유리.
		System.out.println("Strip head part >>> "+str.stripLeading()+",");
		System.out.println("Strip tail part >>> "+str.stripTrailing()+",");
	}
}
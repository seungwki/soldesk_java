package chapter15;

public class StringBuilderMain {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		System.out.println("sb >> "+sb);
		
		sb.insert(4, "Java");
		System.out.println("sb >> "+sb);
		
		sb.delete(4, 7);
		System.out.println("sb >> "+sb);
		
		sb.reverse();
		System.out.println("sb >> "+sb);
		
		System.out.println(sb.toString());
	}
}
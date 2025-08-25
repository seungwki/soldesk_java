package chapter19;

public class InnerOuterMain {
	public static void main(String[] args) {
		InnerOuter io = new InnerOuter();

		InnerOuter.Inner inner = io.new Inner();
		
		System.out.println("inner class = "+inner.getClass());
	}
}
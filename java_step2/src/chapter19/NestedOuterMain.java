package chapter19;

public class NestedOuterMain {
	public static void main(String[] args) {
		NestedOuter no = new NestedOuter();
//		no.print();//안됨
		NestedOuter.NestedUm nest = new NestedOuter.NestedUm();
		nest.print();
		
		System.out.println(nest.getClass());
	}
}
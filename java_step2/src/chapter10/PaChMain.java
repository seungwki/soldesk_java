package chapter10;

public class PaChMain {
public static void main(String[] args) {
	Pa pa = new Pa();
	Pa ch1 = new Ch();
	Ch ch2 = new Ch();
//	Ch ch3 = new Pa(); //절 대 안된다
	pa.display();
	ch1.display();
//	ch1.show();
	ch2.display();
	ch2.show();
}
}
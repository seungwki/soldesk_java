package chapter12;

public class ComputerMain {
	public static void main(String[] args) {
//		Computer c1 = new Computer();//추상클래스의 객체 절대 안된다
		Computer c1 = new DeskTop();
		Computer c2 = new MyNoteBook();
		c1.turnOn();
		c1.display();
		c1.typing();
		c1.turnOff();
		System.out.println("--------------");
		c2.turnOn();
		c2.display();
		c2.typing();
		c2.turnOff();
	}
}

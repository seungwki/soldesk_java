package chapter16;

public class BoxMain2 {
	public static void main(String[] args) {
		ObjectBox box1 = new ObjectBox();
		ObjectBox box2 = new ObjectBox();
		box1.setValue(10);
		box2.setValue("java14");
		System.out.println(box1.getValue());
		System.out.println(box2.getValue());
		System.out.println("------------------");
		Integer newInt = (Integer)box1.getValue(); //Object가 더 super Class 이므로, Integer로 강제 형변환(down casting)
		String newStr = (String)box2.getValue();
		System.out.println(newInt);
		System.out.println(newStr);
		System.out.println("------------------");
		try {
			System.out.println((Integer)box2.getValue());
		} catch (Exception e) {
			System.out.println("Error Occured");
			System.out.println(e);
		}
	}
}
package chapter16;

public class BoxMain3 {
	public static void main(String[] args) {
//		GenericBox<int> gb = new GenericBox<Integer>();//참조변수만 사용 가능
		// GenericBox의 생성 시점에선 결정하지 않고, 사용 시점에서 결정한다.
		GenericBox<Integer> gb1 = new GenericBox<Integer>();
		GenericBox<String> gb2 = new GenericBox<>();//타입 추론
		GenericBox<Double> gb3 = new GenericBox<>();//타입 추론

		gb1.setValue(1689716232);
		gb2.setValue("Hello");
		gb3.setValue(10.0);
		System.out.println(gb1.getValue());
		System.out.println(gb2.getValue());
		System.out.println(gb3.getValue());
		System.out.println("===================================");
		Integer newInt = gb1.getValue();// down casting이 필요 없다. getter가 int를 반환해주기 때문.
		String newStr = gb2.getValue();// down casting이 필요 없다.
		Double newDbl = gb3.getValue();// down casting이 필요 없다.
		System.out.println(newInt);
		System.out.println(newStr);
		System.out.println(newDbl);
	}
}
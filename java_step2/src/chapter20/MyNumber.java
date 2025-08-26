package chapter20;

@FunctionalInterface//어노테이션을 통해 "람다식으로 표현 할 것이다"를 명시 할 수 있다. 필수 아님.
public interface MyNumber {
	int getMax(int num1, int num2);

//	int getMin(int num1, int num2);//추가 하는 순간 MyNumberMain의 람다가 개박살난다
}
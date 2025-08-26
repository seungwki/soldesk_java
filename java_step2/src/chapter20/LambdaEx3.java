package chapter20;

import java.util.function.Function;

public class LambdaEx3 {
	public static void main(String[] args) {
		Function<Integer, Integer> square = x->x*x;//lambdaEx2와 비교해보면 더 간단하게 작성했다.
		//인스턴스나 static의 무언가를 만들지 않고도 함수처럼 사용하고있다.
		System.out.println(square.apply(4));
		//apply에 대해 더 알아보시오
		
		
	}
}
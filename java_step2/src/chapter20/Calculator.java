package chapter20;

@FunctionalInterface // 추상메서드 여러개 못 넣음
public interface Calculator {
	int calc(int n1, int n2);
}

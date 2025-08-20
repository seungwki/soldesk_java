package chapter16;

public class Pair<T1, T2> {
	private T1 first;
	private T2 second;

	public T1 getFirst() {return first;}
	public void setFirst(T1 first) {this.first = first;}
	public T2 getSecond() {return second;}
	public void setSecond(T2 second) {this.second = second;}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "의 first는 " + first + ", second는 " + second;
	}
}
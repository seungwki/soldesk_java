package chapter21;

//try 문에서 선언된 객체들에 대해, try가 종료된 시점에 자원을 자동으로 해제하고 반환한다.
public class AutocloseObj implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed.");
	}
}
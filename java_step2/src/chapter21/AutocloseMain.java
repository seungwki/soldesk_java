package chapter21;

//try 문에서 선언된 객체들에 대해, try가 종료된 시점에 자원을 자동으로 해제하고 반환한다.
public class AutocloseMain {
	public static void main(String[] args) {
		
		try (AutocloseObj obj1 = new AutocloseObj()){// Try-with-resource문 : 자동으로 리소스를 관리하는 구문이다
			System.out.println("Try now");
			throw new Exception("인간형 보스 GOTY죠?");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
package chapter21;

public class Exception6 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("일부러");
			throw e;
			//== throw new Exception("도네 더 받을라고");
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program Exit ");
	}
}

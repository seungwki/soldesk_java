package chapter05;

public class ArrayCopy01 {
	public static void main(String[] args) {
		int[] numArr1 = new int[5];
		int[] numArr2 = new int[5];
		for (int i = 0; i < numArr1.length; i++) {
			numArr1[i] = (i + 1) * 10;
		}
		for (int i = 0; i < numArr1.length; i++) {
			numArr2[i] = i + 1;
		}
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr2[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		
		//원본, 원본의 시작 인덱스, 대상, 시작 인덱스, 갯수(넘으면 박살남)
		System.arraycopy(numArr1, 0, numArr2, 2, 3);
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr2[i] + " ");
		}
		System.out.println();
	}
}

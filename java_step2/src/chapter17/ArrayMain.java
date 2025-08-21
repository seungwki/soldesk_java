package chapter17;

import java.util.Arrays;

public class ArrayMain {
	public static void main(String[] args) {
		int[] arr = new int[5];//정적 배열
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		arr[2] = 190;
		System.out.println(Arrays.toString(arr));
		int target = 190;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] >> "+arr[i]);
			if(arr[i]==target) {
				System.out.println("target detected("+target+")");
				break;
			}
		}
	}
}
package chapter17;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx1 {
	public static void main(String[] args) {
		int total;
		double avg;

		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			ls.add(50 + i * 10);
		}
		total = 0;
		for (Integer i : ls) {
			total += i;
		}
		avg = (double) total / ls.size();
		System.out.println("total >> " + total);
		System.out.println("avg >> " + avg);
	}
}

//조심해 그러다 터지는 counter~
package chapter06;

import java.util.ArrayList;

public class DivisorGpt {
	public static void main(String[] args) {
		DivisorGpt divisor = new DivisorGpt();
		int[] sumArr;
		double[] ratio;
		double maxRatio;
		int target, sum, len, maxSum, maxSumIndex, maxRatioIndex;

		len = 100000;
		sumArr = new int[len + 1];
		ratio = new double[len + 1];

		for (int i = 1; i <= len; i++) {
			target = i;
			int[] divisorList = divisor.getDivisorList(target);

			sum = 0;
			for (int val : divisorList) {
				sum += val;
			}

			sumArr[i] = sum;
			ratio[i] = (double) sum / divisorList.length;
		}

		maxRatio = 0;
		maxSum = 0;
		maxSumIndex = 0;
		maxRatioIndex = 0;

		for (int i = 1; i <= len; i++) {
			if (maxSum < sumArr[i]) {
				maxSum = sumArr[i];
				maxSumIndex = i;
			}
			if (maxRatio < ratio[i]) {
				maxRatio = ratio[i];
				maxRatioIndex = i;
			}
		}

		System.out.printf("max sum(Number) : %d (%d)\n", maxSum, maxSumIndex);
		System.out.printf("max ratio(Number) : %.3f (%d)\n", maxRatio, maxRatioIndex);
	}

	int[] getDivisorList(int number) {
		ArrayList<Integer> list = new ArrayList<>();

		int sqrt = (int) Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				list.add(i);
				int other = number / i;
				if (other != i) {
					list.add(other);
				}
			}
		}

		// 약수를 오름차순으로 정렬하고 싶으면 다음 코드 추가 가능
		// Collections.sort(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}

package chapter06;

public class Divisor {
	public static void main(String[] args) {
		Divisor divisor = new Divisor();
		int[] divisorList, sumArr;
		double[] ratio;
		double maxRatio;
		int target, sum, len, j, maxSum, maxSumIndex, maxRatioIndex;
		len = 100000;
		sumArr = new int[len+1];
		ratio = new double[len+1];
		for (int i = 1; i <= len; i++) {
			sum = 0;
			j = 0;
			target = i;
			divisorList = divisor.getDivisorList(target);
			for (j = 0; j < divisorList.length; j++) {
				sum += divisorList[j];
			}
			sumArr[i] = sum;
			ratio[i] = (double) sum / j;
		}
		System.out.println();
		maxRatio = 0;
		maxSum = 0;
		maxSumIndex = 0;
		maxRatioIndex = 0;
		for (int i = 0; i < ratio.length; i++) {
			if(maxSum<sumArr[i]) {
				maxSum = sumArr[i];
				maxSumIndex = i;
			}
			if(maxRatio<ratio[i]) {
				maxRatio = ratio[i];
				maxRatioIndex = i;
			}
		}
		System.out.printf("max sum(Number) : %d(%d)\n",maxSum,maxSumIndex);
		System.out.printf("max ratio(Number) : %.3f(%d)",maxRatio,maxRatioIndex);
	}

	int[] getDivisorList(int number) {
		int[] divisorList;
		int index;
		index = 0;
		divisorList = new int[(number/2)+4];
		for (int i = 1; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				divisorList[index] = i;
				index++;
				divisorList[index] = number / i;
				index++;
			}
		}
		return divisorList;
	}
}
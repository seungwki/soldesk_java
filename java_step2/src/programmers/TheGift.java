package programmers;

public class TheGift {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] friends = { "muzi", "ryan", "frodo", "neo" };
		String[] gifts = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
				"frodo ryan", "neo muzi" };
		System.out.println(s.solution(friends, gifts));
	}
}

class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;

		// 선물을 많이 보낸 쪽이 선물을 받음
		int[][] giftMatrix = new int[friends.length][friends.length];
		String give, take;
		int giveInt = 0, takeInt = 0;
		int[] nextMonth = new int[friends.length];
		for (int i = 0; i < gifts.length; i++) {
			give = gifts[i].split(" ")[0];
			take = gifts[i].split(" ")[1];
			// 받은 수 추가하기
			for (int j = 0; j < giftMatrix.length; j++) {
				if (friends[j].equals(give)) {
					giveInt = j;
				}
				if (friends[j].equals(take)) {
					takeInt = j;
				}
			}
			giftMatrix[giveInt][takeInt] += 1;
		} // for matrix
		for (int i = 0; i < friends.length - 1; i++) {
			for (int j = i + 1; j < friends.length; j++) {
				if (giftMatrix[i][j] != 0 && giftMatrix[i][j] != giftMatrix[j][i]) {// 선물 기록이 있는지 체크하고, 있다면 큰 쪽에 +1
					if (giftMatrix[i][j] > giftMatrix[j][i]) {
						nextMonth[i] += 1;
					} else {
						nextMonth[j] += 1;
					}
				}else{//선물 지수를 측정
					int giftI = 0,giftJ = 0;
					for(int k=0;k<friends.length;k++) {
						
					}
				}
			}
		} // for friends 탐색
			// 선물의 교환 수가 같다면 선물지수를 검사함
			// 선물지수 : 자기가 보낸 선물 - 자기가 받은 선물
			// 선물 기록 : 0 or same -> 더 큰 사람이 받음
			// 선물지수가 같다면 교환 없음
			// 위와 같은 조건으로 교환이 이루어 질 때, 가장 많은 선물을 받을 친구가 받을 선물의 수를 return

		return answer;
	}

	static int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
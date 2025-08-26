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
		// 선물지수 : 자기가 보낸 선물 - 자기가 받은 선물
		// 선물 기록 : 0 or same -> 더 큰 사람이 받음
		// 선물지수가 같다면 교환 없음
		// 위와 같은 조건으로 교환이 이루어 질 때, 가장 많은 선물을 받을 친구가 받을 선물의 수를 return
		int[][] giftMatrix = new int[friends.length][friends.length];
		String give, take;
		int giveInt = 0, takeInt = 0;
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
		}
		System.out.println();
		return answer;
	}
}
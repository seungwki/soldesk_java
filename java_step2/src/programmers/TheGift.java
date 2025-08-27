package programmers;

public class TheGift {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] friends1 = { "muzi", "ryan", "frodo", "neo" };
		String[] gifts1 = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi",
				"frodo ryan", "neo muzi" };
		String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
		String[] friends3 = {"a", "b", "c"};
		String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
		String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
		System.out.println(s.solution(friends1, gifts1));
		System.out.println(s.solution(friends2, gifts2));
		System.out.println(s.solution(friends3, gifts3));
	}
}

class Solution {
	public int solution(String[] friends, String[] gifts) {
		int answer = 0;

		// 선물을 많이 보낸 쪽이 선물을 받음(같으면 교환 ㄴ)
		int[][] giftMatrix = new int[friends.length][friends.length];
		int giveInt = 0, takeInt = 0;
		int[] nextMonth = new int[friends.length];
		for (int i = 0; i < gifts.length; i++) {//모든 선물 기록에 대해 반복, matrix 완성
			// 받은 수 추가하기
			for (int j = 0; j < friends.length; j++) {//for2
				if (friends[j].equals(gifts[i].split(" ")[0])) {
					giveInt = j;//받은 사람 위치 결정
				}
				if (friends[j].equals(gifts[i].split(" ")[1])) {
					takeInt = j;//준 사람 위치 결정
				}
			}//for2
			giftMatrix[giveInt][takeInt] += 1;
		} // for matrix 완성
		//여기까지 문제 없음
		
		/*
		 1) 두 사람 중, 서로에게 "선물을 더 많이 준 쪽"이 받음(+1)
		 2) 선물의 교환 수가 같다면 선물 지수를 검사함
		 3) 선물지수 : (모두에게)(자기가 보낸 선물 - 자기가 받은 선물) <- 문제 없음
		 4) 선물지수 "높은 쪽"이 받음(+1). 선물 지수가 같다면 교환 없음
		 //*/
		
		for (int i = 0; i < friends.length - 1; i++) {//for1
			for (int j = i + 1; j < friends.length; j++) {//for2
				if (giftMatrix[i][j] != giftMatrix[j][i]) {// 선물 기록이 있는지 체크하고, 있다면 큰 쪽에 +1
					if (giftMatrix[i][j] > giftMatrix[j][i]) {
						nextMonth[i] += 1;
					} else if (giftMatrix[i][j] < giftMatrix[j][i]){
						nextMonth[j] += 1;
					}
				} else {// 선물 지수를 측정
					int giftI = 0, giftJ = 0;
					for (int k = 0; k < friends.length; k++) {
						giftI += giftMatrix[i][k];
						giftJ += giftMatrix[j][k];
						giftI -= giftMatrix[k][i];
						giftJ -= giftMatrix[k][j];
					}
					if(giftI>giftJ) {nextMonth[i]++;}
					else if(giftI<giftJ) {nextMonth[j]++;}
				}
			}//for2
		} // for

		answer = getMax(nextMonth);
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
package programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/389478
/*
#1	10%	w = 1
#2	20%	n은 w의 배수입니다.
#3	70%	추가 제한 사항 없음
*/
/*
제한사항
2 ≤ n ≤ 100
1 ≤ w ≤ 10
1 ≤ num ≤ n
*/
public class Fedex {
	public static void main(String[] args) {
		int answer1 = new Fedex().new Solution().solution(22, 6, 8);
		int answer2 = new Fedex().new Solution().solution(13, 3, 6);

		System.out.println(answer1);// 3
		System.out.println(answer2);// 4
	}

	class Solution {
		public int solution(int n, int w, int num) {
			int answer = 0;
			// 박스 생성
			int[][] box = new int[n / num + (n % w == 0 ? 0 : 1)][w];

			// 박스 그리드 초기화
			for (int i = 0; i < box.length; i++) {// 행
				for (int j = (i % 2 != 0 ? w - 1 : 0); j < w; j += i % 2 != 0 ? -1 : 1) {// 열
					if (i * w + j > n) {
						box[i][j] = 1;
					}
				}
			}

			//
			/*
			 * num의 좌표 -> i -> num/w j -> i%2==0?정:역
			 */
			for (int i = num / w; i < box.length; i++) {
				answer += box[i][num % w];
			}
			return answer;
		}
	}// class solution
}

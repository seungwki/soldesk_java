package chapter17;

import java.util.List;
import java.util.Vector;
//Vector와 ArrayList의 차이는 멀티쓰레드 환경에서 동기화 되어 있는가(Vector는 Synchronized임) 아닌가의 차이이다
//그럼 멀티 쓰레드 환경에서 Vector를 쓰는군요!
//아뇨 강제동기화 때문에 성능 떨어지니 걍 SyncronizedList를 쓰십시오
//심지어 Vector의 메서드만 Sync해놓고 인스턴스 자체에는 Sync가 되어 있지 않아 딱히 안정적인 것도 아니다
//만들던 시점에서야 멀쓰에서 쓰라고 만들긴 했는데 지금은 ^호환성^ 때문에 못 지우고 남겨놓는 흔적기관 같은거임
//아무튼 ^Deprecated^됨
public class BoardMain {
	public static void main(String[] args) {
		List<Board> vct = new Vector<>();
		for (int i = 0; i < 5; i++) {
			vct.add(new Board("제목" + (i + 1), "내용" + (i + 1), "글쓴이" + (i + 1)));
		}
		showAll(vct);
		System.out.println("----------------");
		vct.remove(2);
		vct.remove(2);
		showAll(vct);
		System.out.println("----------------");
	}

	static void showAll(List<Board> vct) {
		for (Board board : vct) {
			System.out.println(board);
		}
	}
}

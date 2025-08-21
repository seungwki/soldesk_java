package chapter17;

public class Node {
//	private Object obj;
//	private Node nextNode;

	Object item; //데이터
	Node next; //다음 노드

	public Node(Object item) {
		this.item = item;
	}

	// 반복문 안에서 문자를 더하기 때문에 StringBuilder사용
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node x = this;
		sb.append("[");
		while (x != null) {
			sb.append(x.item);
			if (x.next != null) {
				sb.append("->");
			}
			x = x.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
package chapter05;

public class ArrayTest06 {
	public static void main(String[] args) {
		String[] charTile;
		charTile = new String[] { "동", "남", "서", "북", "백", "발", "중" };
		StringBuilder sb = new StringBuilder();
		String allChar = "";
		for (int i = 0; i < charTile.length; i++) {
			allChar +=charTile[i] + "\n";
		}
		System.out.println(allChar);
	}
}
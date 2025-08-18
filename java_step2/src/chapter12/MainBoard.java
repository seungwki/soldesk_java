package chapter12;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		System.out.println(player.getLevel());
		player.play(3);
		System.out.println("------------------------");
		player.upgradeLevel(new AdvancedLevel());
		player.getLevel();
		player.play(4);
		System.out.println("------------------------");
		player.upgradeLevel(new SuperLevel());
		player.getLevel();
		player.play(5);
	}
}
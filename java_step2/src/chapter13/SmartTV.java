package chapter13;

public class SmartTV implements Searchable, Remote {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("turn Off");
	}

	@Override
	public void setVolume(int volume) {
		if (volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
			System.out.println("Change Volume "+volume);
			this.volume = volume;
		} else {
			System.out.println("Can't");
		}
	}

	@Override
	public void search(String url) {
		System.out.println("search "+url);
	}
}
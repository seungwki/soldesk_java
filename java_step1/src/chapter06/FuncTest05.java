package chapter06;

public class FuncTest05 {
	// 멤버변수 == 필드
	public String channel;
	public int channelInt;
	public int volume;

	// 기본 생성자
	public FuncTest05() {
	}
	
	// 멤버 메서드
	public void volumeUp(int volume) {this.volume=volume; System.out.println("음량을 "+volume+" 만큼 올립니다.");}
	public void volumeDown(int volume) {this.volume=volume;System.out.println("음량을 "+volume+" 만큼 내립니다.");}
	public void channelChange(String channel) {this.channel = channel; System.out.println("채널을 "+channel+"로 변경합니다.");}
	public void channelChange(int channelInt) {this.channelInt=channelInt;System.out.println("채널을 "+channelInt+"로 변경합니다.");}

	public static void main(String[] args) {
		FuncTest05 tv = new FuncTest05();
		System.out.println("현재 음량>>"+tv.volume);
		tv.volumeUp(5);
		tv.volumeDown(3);
		tv.channelChange(3);
		tv.channelChange("스파클");
		System.out.println("현재 음량>>"+tv.volume);
	}
}
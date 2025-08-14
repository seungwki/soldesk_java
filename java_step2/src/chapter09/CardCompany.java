package chapter09;
/*카드 회사는 카드를 발급 할 때마다 카드 고유번호를 준다.
 * 카드가 생성 될 때마다 카드 번호가 자동으로 증가 할 수 있도록 카드 클래스를 생성한다.
 * 카드회사 클래스 CardComny는 싱글톤으로 작성한다.
 * 
 * CardCompany의 인스턴스를 얻고, 이를 통해 카드를 발급한다.
 * 카드회사에서 카드를 발급할 때마다 카드 고유번호가 자동으로 증가하는지를 확인한다.*/

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	private CardCompany() {}
	public CardCompany getCardCompany() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	public Card makeCard() {
		Card newCard = new Card();
		return newCard;
	}
	
	public static void main(String[] args) {
		CardCompany cc = CardCompany.instance;
		Card card1 = cc.makeCard();
		Card card2 = cc.makeCard();
		Card card3 = cc.makeCard();
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		System.out.println(card3.getCardNumber());
	}
}
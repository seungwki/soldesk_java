package chapter11;

public class Vipcustomer extends Customer {
	private int agentId;// 담당직원
	double saleRatio;// 할인율

	public Vipcustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		this.customerGrade = "VIP";
		bonusRatio = 0.05; // 적립률 5%, 실질 적립은 0.45%
		saleRatio = 0.1; // 할인율 10%
	}

	@Override//포인트 적립을 수행하고 할인된 가격을 반환.
	public int calcPrice(int price) {
		bonusPoint += (price-(int)(price*saleRatio))*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n 담당 직원은 "+agentId+"입니다.";
	}
	public int getAgentId() {
		return agentId;
	}
}
package chapter11;

public class Customer {
	protected int customerId;// 같은 패키지(==chapter11 내부)와, 해당 Customer를 상속 받은 하위 클래스에서 사용 가능.
	protected String customerName;
	protected String customerGrade;// 고객 등급
	public double bonusPoint;// 구매시 누적된 포인트
	protected double bonusRatio;// bonusPoint가 적립 되는 비율

	public Customer() {
		customerGrade = "SILVER"; // 기본 Silver 시작
		bonusRatio = 0.01;// 기본 1 %
	}

	// 생성자 오버로딩
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomer() {
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "원 입니다.";
	}
	public int getCustomerId() {return customerId;}
	public void setCustomerId(int customerId) {this.customerId = customerId;}
	public String getCustomerName() {return customerName;}
	public void setCustomerName(String customerName) {this.customerName = customerName;	}
	public String getCustomerGrade() {return customerGrade;}
	public void setCustomerGrade(String customerGrade) {this.customerGrade = customerGrade;}
	public double getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}
	public double getBonusRatio() {return bonusRatio;}
	public void setBonusRatio(double bonusRatio) {this.bonusRatio = bonusRatio;}

}
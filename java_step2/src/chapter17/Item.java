package chapter17;

public class Item {
	private String name;
	private int price;
	private int quant;

	public Item(String name, int price, int quant) {this.name = name;this.price = price;this.quant = quant;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public int getQuant() {return quant;}
	public void setQuant(int quant) {this.quant = quant;}
	
	public int getTotalPrice() {
		return price*quant;
		}

}

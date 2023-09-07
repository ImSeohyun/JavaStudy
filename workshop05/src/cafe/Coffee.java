package cafe;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee() {}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		String str = name + "\t"+price;
		return str;
	}
///////
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

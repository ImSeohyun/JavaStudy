package cafe;

public class Cafe {

	//Cafe has a Coffee���
	Coffee[] coffeeList;
	private int index; //0
	
	//������: �ν��Ͻ� ���� �ʱ�ȭ
	public Cafe(){
		//�迭�� �������ִ°� �ʱ�ȭ
		coffeeList = new Coffee[3];
	}
	
	public int totalPrice() {
		int tp = 0;
		for(Coffee c: coffeeList) {
			tp+=c.getPrice();
		}
		return tp;
	}
	public void setCoffee(Coffee c) {
		if(index == coffeeList.length) {
			System.out.println("�� �̻� ������ �� �����ϴ�.");
		}else {
			coffeeList[index] = c;
			index++;
		}
	}
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
	
}

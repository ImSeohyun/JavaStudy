package cafe;

public class Cafe {

	//Cafe has a Coffee목록
	Coffee[] coffeeList;
	private int index; //0
	
	//생성자: 인스턴스 변수 초기화
	public Cafe(){
		//배열은 생성해주는게 초기화
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
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {
			coffeeList[index] = c;
			index++;
		}
	}
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
	
}

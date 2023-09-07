package vehicle;

public class Truck extends Car{

	public Truck() {}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	@Override
	public double getEfficiency() {
		//부모의 getefficiency라는 것을 명시하지 않으면 지금 이 메서드를 계속 호출하며 무한 반복되기 때문에 super 붙여야한다
		double e = super.getEfficiency()- getCurWeight()/5*0.2;
		return e;
	}
	@Override
	public void moving(int distance) {
		double oil = calcOil(distance);
		setRestOil(getRestOil()-oil);
	}
	private double calcOil(int distance) {
		return distance/getEfficiency();
	}
	public int getCost(int distance) {
		double oil = calcOil(distance);
		return (int)oil*3000;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getEfficiency();
	}

}

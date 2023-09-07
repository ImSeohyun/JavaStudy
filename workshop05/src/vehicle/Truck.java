package vehicle;

public class Truck extends Car{

	public Truck() {}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	@Override
	public double getEfficiency() {
		//�θ��� getefficiency��� ���� ������� ������ ���� �� �޼��带 ��� ȣ���ϸ� ���� �ݺ��Ǳ� ������ super �ٿ����Ѵ�
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

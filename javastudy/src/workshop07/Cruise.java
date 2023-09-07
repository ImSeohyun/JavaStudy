package workshop07;

public class Cruise extends Ship{

	public Cruise() {};
	
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank()-13*dist);
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank()+8*fuel);		
	}
}

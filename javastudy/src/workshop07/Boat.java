package workshop07;

public class Boat extends Ship{

	public Boat() {};
	
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		setFuelTank(getFuelTank()-10*dist);
	}

	@Override
	public void refuel(int fuel) {
		setFuelTank(getFuelTank()+10*fuel);		
	}

}

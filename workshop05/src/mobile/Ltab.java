package mobile;

public class Ltab extends Mobile{

	public Ltab() {}

	public Ltab(String mobileName, int battery, String osType) {
		super(mobileName, battery, osType);
	}

	@Override
	public int operate(int time) {
		int battery = getBattery()-10*time;
		setBattery(battery);
		return battery;
	}

	@Override
	public int charge(int time) {
		int battery = getBattery()+10*time;
		setBattery(battery);
		return battery;
	}

	
}

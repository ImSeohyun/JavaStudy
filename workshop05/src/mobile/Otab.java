package mobile;

public class Otab extends Mobile{

	public Otab() {}

	public Otab(String mobileName, int battery, String osType) {
		super(mobileName, battery, osType);
	}

	@Override
	public int operate(int time) {
		int battery = getBattery()-12*time;
		setBattery(battery);
		return battery;
	}

	@Override
	public int charge(int time) {
		int battery = getBattery()+8*time;
		setBattery(battery);
		return battery;
	}
	
	
}

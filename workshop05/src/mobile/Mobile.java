package mobile;

public abstract class Mobile {

	private String mobileName;
	private int battery;
	private String osType;
	
	public Mobile() {}

	public Mobile(String mobileName, int battery, String osType) {
		this.mobileName = mobileName;
		this.battery = battery;
		this.osType = osType;
	}
	//�߻�޼���: �߻� Ŭ�������� �߻�޼���� abstract �ʼ�
	public abstract int operate(int time);
	public abstract int charge(int time);
////
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
}

package com.car;

public class L3 extends Car implements Temp{

	public L3 () {}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public void go(int distance) {
		setOilSize(getOilSize()-distance/10);
		setDistance(distance);
	}

	@Override
	public void setOil(int oilSize) {
		super.setOil(oilSize);
	}

	@Override
	public int getTempGage() {
		return getDistance()/10;
	}
	
	
}

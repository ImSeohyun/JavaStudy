package com.car;

public class CarTest {

	public static void main(String[] args) {

		L3 l3 = new L3("L3","1500",50,25,0);
		L5 l5 = new L5("L5","2000",70,35,0);

		System.out.println("vehicleName engineSize oilTank oilSize distance temperature");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l3.getName()+"\t\t"+l3.getEngine()+"\t"+l3.getOilTank()+"\t"+l3.getOilSize()+"\t"+l3.getDistance()+"\t"+l3.getTempGage());
		System.out.println(l5.getName()+"\t\t"+l5.getEngine()+"\t"+l5.getOilTank()+"\t"+l5.getOilSize()+"\t"+l5.getDistance()+"\t"+l5.getTempGage());
		
		System.out.println();
		System.out.println("25 주유");
		l3.setOil(25);
		l5.setOil(25);
		
		System.out.println("vehicleName engineSize oilTank oilSize distance temperature");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l3.getName()+"\t\t"+l3.getEngine()+"\t"+l3.getOilTank()+"\t"+l3.getOilSize()+"\t"+l3.getDistance()+"\t"+l3.getTempGage());
		System.out.println(l5.getName()+"\t\t"+l5.getEngine()+"\t"+l5.getOilTank()+"\t"+l5.getOilSize()+"\t"+l5.getDistance()+"\t"+l5.getTempGage());
		
		System.out.println();
		System.out.println("80 주행");
		l3.go(80);
		l5.go(80);
		
		System.out.println("vehicleName engineSize oilTank oilSize distance temperature");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(l3.getName()+"\t\t"+l3.getEngine()+"\t"+l3.getOilTank()+"\t"+l3.getOilSize()+"\t"+l3.getDistance()+"\t"+l3.getTempGage());
		System.out.println(l5.getName()+"\t\t"+l5.getEngine()+"\t"+l5.getOilTank()+"\t"+l5.getOilSize()+"\t"+l5.getDistance()+"\t"+l5.getTempGage());
		
	}
}

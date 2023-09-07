package workshop07;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		// ArrayList를 만들어 각각의 Boat 객체와 Cruise객체를 생성하여 넣는다
		 ArrayList<Ship> list = new ArrayList<Ship>();
		 
		 list.add(new Boat("Boat01",500));
		 list.add(new Cruise("Cruise01",1000));
		 
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // 생성된 객체의 정보 출력 - for문 사용
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 System.out.println();
		 System.out.println("10운항");
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // Boat인 경우에는 10 운항하고 Cruise인 경우에는 15 운항후 객체 정보 출력 -for 문 사용
		 list.get(0).sail(10);
		 list.get(1).sail(15);
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 System.out.println();
		 System.out.println("50주유");
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // Boat인 경우에는 20 주유하고 Cruise인 경우에는 30 주유 후 객체 정보 출력 -for 문 사용
		 list.get(0).refuel(20);
		 list.get(1).refuel(30);
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 
	}
}

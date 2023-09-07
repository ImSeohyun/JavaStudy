package workshop07;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		// ArrayList�� ����� ������ Boat ��ü�� Cruise��ü�� �����Ͽ� �ִ´�
		 ArrayList<Ship> list = new ArrayList<Ship>();
		 
		 list.add(new Boat("Boat01",500));
		 list.add(new Cruise("Cruise01",1000));
		 
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // ������ ��ü�� ���� ��� - for�� ���
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 System.out.println();
		 System.out.println("10����");
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // Boat�� ��쿡�� 10 �����ϰ� Cruise�� ��쿡�� 15 ������ ��ü ���� ��� -for �� ���
		 list.get(0).sail(10);
		 list.get(1).sail(15);
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 System.out.println();
		 System.out.println("50����");
		 System.out.println("shipName \t fuelTank");
		 System.out.println("------------------");
		 // Boat�� ��쿡�� 20 �����ϰ� Cruise�� ��쿡�� 30 ���� �� ��ü ���� ��� -for �� ���
		 list.get(0).refuel(20);
		 list.get(1).refuel(30);
		 for(Ship s:list) {
			 System.out.println(s.getShipName()+"\t"+s.getFuelTank());
		 }
		 
		 
	}
}

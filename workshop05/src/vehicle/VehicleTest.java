package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Truck car = new Truck(1000, 100, 5);

        // �ʱ� Ʈ���� ������ ����Ѵ�.
        System.out.println("�ִ������߷� \t ������ũũ�� \t �ܿ����Ϸ� \t ���������߷� \t ����");
        System.out.println("================================================================");
        System.out.println(car);        
        
        // 50L�� �����Ѵ�.
        car.addOil(50);
        
        System.out.println();
        System.out.println("50L ���� ��");
        System.out.println(car);        
        
        // 50Km�� �����Ѵ�.
        car.moving(50);
        System.out.println();
        System.out.println("50Km ���� ��");
        System.out.println(car);        
        
        // 100Kg�� ��ǰ�� �����Ѵ�.
        car.addWeight(100);
        
        System.out.println();
        System.out.println("100Kg ���� ��");        
        System.out.println(car);        
        
        // 30Km�� �����Ѵ�.
        car.moving(30);

        System.out.println();
        System.out.println("30Km ���� ��");        
        System.out.println(car);        

        // 30Km ���� �� ����� ����Ѵ�.
        System.out.println();
        System.out.println("��� : " + car.getCost(30) + "��");
	}
}

package exam06;

public class TestPet {

	public static void main(String[] args) { 
	
		Cat c1 = new Cat("�߿���", 2);
	
		Dog d1 = new Dog("��ġ", 1, "����");
		
		Bird b1 = new Bird("��ġ", 2, "��");
		
		
		System.out.printf("Cat �̸�: %s, Cat ����:%d \n", c1.getName(), c1.getAge());
		System.out.printf("Dog �̸�: %s, Dog ����:%d, Dog ����:%s \n", d1.getName(), d1.getAge(), d1.getSex() );
		System.out.printf("Bird �̸�: %s, Bird ����:%d, Bird ����:%s \n", b1.getName(), b1.getAge(), b1.getColor());
	
		//������� �߰� �޼���
		c1.eat();
		c1.sleep();
		c1.run();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		b1.fly();
	}

}
package exam07_3;

public class TestPet {

	public static void main(String[] args) {

		// 1. �Ϲ� ��ü ����
		Cat c1 = new Cat("�߿���", 2);
		Dog d1 = new Dog("��ġ", 1, "����");
		Bird b1 = new Bird("��ġ", 1, "��");
		
		// ���� �ڵ��� ������ �����ؾߵ� �޼��尡 ��������.
		c1.eat();
		c1.sleep();
		
		d1.eatDog();
		d1.sleepDog();
		
		b1.eatBird();
		b1.sleepBird();

		
	}

}
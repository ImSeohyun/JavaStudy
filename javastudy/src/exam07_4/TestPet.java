package exam07_4;

public class TestPet {

	public static void main(String[] args) {

		// 1. �Ϲ� ��ü ����
		Cat c1 = new Cat("�߿���", 2);
		Dog d1 = new Dog("��ġ", 1, "����");
		Bird b1 = new Bird("��ġ", 1, "��");
		
		// ���� �ڵ��� ������ �����ؾߵ� �޼��尡 ��������.
		// �ذ�: �߻�޼���� �����Ͽ� ���ϼ� �ο�
		c1.eat();
		c1.sleep();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		
		// �߻� Ŭ������ ��ü���� �Ұ�
//		Pet p = new Pet();
		
		// ������ ( new�� �Ұ��������� ������ ������Ÿ������ ��� ����)
		Pet p = new Cat();

	}

}
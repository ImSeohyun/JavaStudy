package exam07;

public class TestPet {

	public static void main(String[] args) {
		
		//1. �Ϲ� ��ü ����
		Cat c = new Cat("�߿���",2);
		Dog d = new Dog("�۸���",1,"����");
		Bird b = new  Bird("±±��",1,"��");
		
		System.out.printf("Cat �̸�: %s, Cat ����:%d \n", c.getName(), c.getAge());
		System.out.printf("Dog �̸�: %s, Dog ����:%d, Dog ����:%s \n", d.getName(), d.getAge(), d.getSex() );
		System.out.printf("Bird �̸�: %s, Bird ����:%d, Bird ����:%s \n", b.getName(), b.getAge(), b.getColor());

		System.out.println();
		//2. ������ ����
		Pet p = new Cat("�߿���",2);
			System.out.printf("Cat �̸�: %s, Cat ����:%d \n", c.getName(), c.getAge());
			p = new Dog("�۸���",1,"����");
			System.out.printf("Dog �̸�: %s, Dog ����:%d \n", d.getName(), d.getAge());
			p = new  Bird("±±��",1,"��");
			System.out.printf("Bird �̸�: %s, Bird ����:%d \n" , b.getName(), b.getAge());
		
	}
}

package exam07;

public class TestPet3 {

	public static void a(Pet p) {
		
	}
	public static void b(Object x) {
		
	}
	
	public static void main(String[] args) {
		
		//������ Ȱ��
		Cat c1 = new Cat("�߿���", 2);
		Dog d1 = new Dog("��ġ", 1, "����");
		Bird b1 = new Bird("��ġ", 1, "��");
		
		a(c1);
		a(d1);
		a(b1);
		
		//Ȯ��
		b(10);
		b(3.14);
		b(true);
		b(c1);
		b("hello");
		
	}
}

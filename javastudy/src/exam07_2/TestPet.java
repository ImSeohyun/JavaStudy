package exam07_2;

public class TestPet {

	public static void main(String[] args) {
		
		//1. �Ϲ� ��ü ����
		Cat c = new Cat("�߿���",2);
		Dog d = new Dog("�۸���",1,"����");
		Bird b = new  Bird("±±��",1,"��");
		
		System.out.println(c.toString());
		System.out.println(b.toString());
		System.out.println(d.toString());
		
	}
}

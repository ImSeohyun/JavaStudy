package exam04_5;

//�ϳ��� Ŭ�������� �������� Ŭ���� ���� ���� -> ���������� �ǽ��� �� ���
class Cat {
	String name;
	String sex;
	int age;
	
	public Cat() {}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class TestPet {

	// PDT ( call by value )
		public static void pdt(int x) {
			x = 20;
		}
		
		// RDT ( call by value reference)
		public static void rdt(Cat x) {
			x.setAge(20);
		}
		
	public static void main(String[] args) {
		
		//�⺻��
		int n = 10;
		System.out.println("ȣ����:" + n);
		pdt(n); //call by value
		System.out.println("ȣ����:" + n);//�� ���� ����
		
		//������
		Cat c = new Cat("�߿���", 2, "����");
		System.out.println("ȣ���� ����:" + c.getAge());
		rdt(c); //call by value reference �ּҰ� ���޷� �� ���� ����
		System.out.println("ȣ���� ����:" + c.getAge());
		
	}
}

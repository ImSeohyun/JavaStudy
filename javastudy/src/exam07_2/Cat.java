package exam07_2;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}

	//�������̵�
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public String toString() {
		return String.format("Cat �̸�: %s, Cat ����:%d \n", name,age);
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}

	public Cat(String name, int age) {
		super(name, age); //����� �θ� ȣ��
		//�θ𿡰� �ش� ������ ������ �̰� �θ𿡰� �Ѱ� �θ� �ʱ�ȭ��
	}
	
	
	
	
}

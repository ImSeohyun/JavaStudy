package exam06_5;

// Cat is a Pet ==> ��Ӱ���
public class Cat extends Pet{

	public void run() {
		System.out.println("Cat.run");
	}
	
	// �޼��� ������ ( overriding )
	@Override  // @���� �����ϴ� �ڵ带 ������̼�(annotation)�̶�� �θ���.
	public void eat() {
		System.out.println("Cat.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	

}
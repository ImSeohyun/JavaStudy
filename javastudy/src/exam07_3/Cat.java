package exam07_3;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}
	// �������̵�
	@Override
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
	@Override
	public String toString() {
		return String.format("Cat �̸�: %s, Cat ����:%d \n", name, age);
	}
	
	
	
}





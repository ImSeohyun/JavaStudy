package exam06_4;


// Cat, Dog, Bird �� �θ� Ŭ����
public class Pet {
	
	String name;
	int age;

	public void eat() {
		System.out.println("Pet.eat");
	}
	public void sleep() {
		System.out.println("Pet.sleep");
	}
	
	// ������
	public Pet() {
		System.out.println("Pet ������");
	}
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
package exam07_2;

public class Cat extends Pet {

	public void run() {
		System.out.println("Cat.run");
	}

	//오버라이딩
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public String toString() {
		return String.format("Cat 이름: %s, Cat 나이:%d \n", name,age);
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	public Cat() {}

	public Cat(String name, int age) {
		super(name, age); //명시적 부모 호출
		//부모에게 해당 변수가 있으니 이걸 부모에게 넘겨 부모가 초기화함
	}
	
	
	
	
}

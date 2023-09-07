package exam07_1;

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

	// ������
	public Cat() {
		//ù ���ο��� super([��,,,]); ��밡���ϴ�.
		super(); // �ڵ� ����, �θ��� �⺻������ ȣ���ϴ� �ڵ�
		System.out.println("Cat ������");
	}

	public Cat(String name, int age) {
		//�θ𿡼� ����� ������ �θ� �ʱ�ȭ��.
		super(name, age);// �ڵ� ����
		System.out.println("Cat ������2");
		
		//�θ𿡼� ����� ������ �ڽ��� �ʱ�ȭ��.
//		this.name = name;
//		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	

	

}
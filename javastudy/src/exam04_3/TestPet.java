package exam04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("�߿���",2,"����");
	
		//��� - �ν��Ͻ� ���� ���� ���� (����X)
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);

		//���2- getter �޼��� �̿� ����
		String name = c.getName();
		int age = c.getAge();
		String sex = c.getSex();

		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		
		//����1 - �ν��Ͻ� ���� ���� ���� (���� X)
		c.age=3;
		System.out.println(c.getAge());
		
		//����2 - setter �޼��� �̿� ����
		c.setAge(3);
		c.setName("meow");
		c.setSex("male");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
	}
}

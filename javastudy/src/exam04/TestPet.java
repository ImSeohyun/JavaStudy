package exam04;

public class TestPet {

	public static void main(String[] args) {
		
		//��ü ����
		// Ŭ������ ������ = new Ŭ������();
		
		//�����: �߿��� 2 ����
		Cat c = new Cat();  //cat Ŭ���� �޸𸮿� �ø�
		//��� ����
		c.name="�߿���";
		c.age=2;
		c.sex="female";
		System.out.println(c.name);
		
		//�����: ���� 1 ����
		Cat c2 = new Cat();
		c.name="����";
		c.age=1;
		c.sex="male";
		System.out.println(c2.name);

	}
}

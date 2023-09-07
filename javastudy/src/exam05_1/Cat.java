package exam05_1;

public class Cat {

	//Cat Ŭ������ ������ ��ȣ
	private String name;
	private int age;
	private String sex;
	
	public Cat() {}
	
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setName(String name) {
		this.name = name;
		
		info();
	}
	
	//info �޼���� �ܺο��� ���� ������� ����
	// cat Ŭ������ setName�޼��忡���� ���
	//�ܺο��� hide������
	/*
	 *   ����ȭ(ĸ��ȭ, encapsulation)
	 *   1. ������ ��ȣ
	 *   2. ���⼺ ����ȿ��
	 * 
	 */
	private void info() {
		System.out.println("info");
	}
	
}

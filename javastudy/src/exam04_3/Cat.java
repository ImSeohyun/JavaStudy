package exam04_3;

public class Cat {
	
	//�ν��Ͻ� ����
	String name;
	int age;
	String sex;
	
	//������
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Cat() {
	}
	
	//getter�޼���
	//�̸����: ��x, ��o
	public String getName() {
		return name;
	}
	
	//���̾��
	public int getAge() {
		return age;
	}
	//���� ���
	public String getSex() {
		return sex;
	}
	
	//setter �޼���
	//���̼���
	public void setAge(int age) {
		this.age = age;
	}
	//�̸�����
	public void setName(String name) {
		this.name = name;
	}
	
	//��������
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}

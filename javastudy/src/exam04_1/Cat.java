package exam04_1;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	//������(constructor): �ν��Ͻ� ���� �ʱ�ȭ
	//�����ε� ������ 
	public Cat() {	} //�⺻ ������
	public Cat(String n) {	}
	public Cat(int n) {	}
	public Cat(String a, int n) {}
	public Cat(int n, String a) {}
	
	public Cat(String name, int a, String s) {
		this.name = name; //this ���� ����
		this.age = a;
		sex = s;
	}

}

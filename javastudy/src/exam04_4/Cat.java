package exam04_4;

public class Cat {

	String name;
	int age;
	String sex;
	
	public Cat() {	}


	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//�ʿ��ϸ� �޼��� �߰�
	//�̸��� ���� �Ѳ����� �����ϴ� �޼���
	public void setNameAge(String name, int age) {
		this.name= name;
		this.age = age;
	}
	
	//���̿� ���� �Ѳ����� �����ϴ� �޼���
	public void setAgeSex(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	//getter+setter ��� ��� �����ϴ� �޼���
	public String getCat(String name, int age, String sex) {
		return name+" "+age+" "+sex;
	}
	
	//�ΰ��� ������ �Ѳ����� ��ȯ�ϴ� ���
	public int [] getInt() {
		return new int[] {10,20}; //���ϰ� �ݵ�� �ϳ��� ����.-> ���ڿ�,���� �Ұ���
	}
	
	// ����Ÿ���� void �ε�  return Ű���� ����ϴ� ���
	public void xxx() {
		System.out.println("xxx1");
		if(true) return; //�߰��� xxx�޼��� �����ϰ� ��ȯ
		System.out.println("xxx2");
		System.out.println("xxx3");
		 
	}
	
	//�ڵ�����ȯ: byte>short>int>long>float>double
	public void yyy(double n) { //int, long, float, double ��� ����
		xxx(); //�ڽ��� �ڽž��� �ٸ� �޼��� ȣ�� ����. this.xxx()�� ����
	}
}
package exam05_2;

class Count {
	
	int n; //�ν��Ͻ� ����, ��ü ���� ���� ������� 
	static int m; //static ����, ���α׷� ���� �� �� �� �������,���Ÿ�ü, �ڵ��ʱ�ȭ, Ŭ���������� ����
	
	public Count() {
		n++;
		m++;
	}
	public void n_print(){
		System.out.println("n"+n); //�ν��Ͻ� ���� ���� ����
		System.out.println("m"+m); //static ���� ���� ����
	}
	
	public static void m_print() { //static �޼���
		//System.out.println("n"+n); //�ν��Ͻ� ���� ���� �Ұ�
		//System.out.println(this); //this ��� �Ұ�
		System.out.println("m"+m); // static ���� ���� ����
	}
}

public class TestMain {

	public static void main(String[] args) {

		//new �ϱ� �� static ���� ����
		System.out.println(Count.m); //0
		Count.m_print(); //new ���� �ʰ� �޼��� ������
		
		//Count ��ü ���� �� �� �ߴ���
		Count c = new Count();
		c.n_print();
		Count c2 = new Count();
		c2.n_print();
		
		System.out.println(Count.m);
		
	}

}

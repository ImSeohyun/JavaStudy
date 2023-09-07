package exam07_5;

//�������̽�
interface Y1{
	//1)���
	final int NUM=10; // ���, �ڵ����� public static final �����ȴ�.
	int SIZE= 20;     // ����ó�� ���̴µ� ���. �ڵ����� public static final �����ȴ�.
	public static final int COUNT = 30; //����
	
	// 2) �߻� �޼��� ( �������̽��� ����ϴ� ���� ū �����̴�. )
	public abstract void a(); // ����
	public void a2(); // �ڵ����� public abstract �����ȴ�.
	void a3();        // default ���������ڷ� ���̴µ� public �̴�.
	
	// 3) default �޼���
	public default void b() {
		System.out.println("default �޼���");
	}
	// 4) static �޼���
	public static void c() {
		System.out.println("static �޼���");
	}
}

interface Y2{
	public abstract void x();
}
interface Y3{
	public abstract void x2();
}
class K implements Y2{
	@Override
	public void x() {

	} // ����
}

class K2 implements Y2, Y3{ // ���� ����

	@Override
	public void x2() {}

	@Override
	public void x() {}  
	
}
// �������̽� �� ��� ( ���߻�� )
interface Y4 extends Y2, Y3{
	
}
// ��� �� ����
class K3 extends Object implements Y2, Y3{
	@Override
	public void x2() {}

	@Override
	public void x() {}  
}
class Z implements Y1{

	@Override
	public void a() {
	}

	@Override
	public void a2() {
	}

	@Override
	public void a3() {		
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {

//		Y2 y = new Y2(); // new �Ұ�
		
		K k = new K();
		k.x();
		
		//������ ( �ſ� �߿� )
		Y2 k2 = new K();
		k2.x();
		
		Z z = new Z();
		z.a();
		z.a2();
		z.a3();
		
		System.out.println(Y1.NUM);
		System.out.println(Y1.SIZE);
		System.out.println(Y1.COUNT);
		z.b();//default �޼���� �Ϲ�Ŭ������ concrete �޼���ó�� ����Ѵ�
		
		Y1.c(); //static �޼���
	}

}




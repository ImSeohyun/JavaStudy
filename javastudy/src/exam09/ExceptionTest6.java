package exam09;


class Test5{
	
	public void b() throws ArithmeticException,NullPointerException {
		System.out.println("Test.a");
		//���� �۾�
		// ArithmeticException �߻� ������ �ڵ�
		int num = 0;
		int result= 10/num;  
		System.out.println("�����:" + result);
		
		// NullPointerException �߻� ������ �ڵ�
		String n=null;
		System.out.println(n.length());
		
	}
	public void a() throws ArithmeticException,NullPointerException {
	    b();
	}
}
public class ExceptionTest6 {
	public static void main(String[] args) {
		// ��������
		System.out.println("1");
		System.out.println("2");
		Test5 t = new Test5();
		try {
			t.a();
		}catch(ArithmeticException e) {
			System.out.println("error: 0 ���� ������ �߻�");
		}catch(NullPointerException e) {  
			System.out.println("error: ��ü ���� �ʿ�");
		}catch(Exception e) {  // ���������� ���� �������� ����Ѵ�.
			System.out.println("error �߻�");
		}
		System.out.println("end. ��������");

	}

}
package exam09;


class Test4{
	
	public void b() throws ArithmeticException {
		System.out.println("Test.a");
		//���� �۾�
		// ArithmeticException �߻� ������ �ڵ�
		int num = 0;
		int result= 10/num;  
		System.out.println("�����:" + result);
	}
	public void a() throws ArithmeticException {
	    b();
	}
}

public class ExceptionTest5 {
	public static void main(String[] args) {
		// ��������
		System.out.println("1");
		System.out.println("2");
		Test4 t = new Test4();
		try {
			t.a();
		}catch(ArithmeticException e) {
			System.out.println("error: 0 ���� ������ �߻�");
		}
		System.out.println("end. ��������");

	}

}
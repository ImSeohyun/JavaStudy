package exam09;


class Test2{
	
	public void a() {
		System.out.println("Test.a");
		//���� �۾�
		try {
			int num = 0;
			int result= 10/num;  // ���� �߻� ==> ���������� ��. ==> �������� ��.
			System.out.println("�����:" + result);
		}catch(ArithmeticException e) {  // ������ Ŭ����, ������ ���� ����
			System.out.println("error: 0 ���� ������ �߻�");
//			System.out.println("error:" + e.getMessage()); // / by zero
//			e.printStackTrace();  // ���ܹ߻��� �����ڰ� ���������� �����.
		}
		
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		// ��������
		System.out.println("1");
		System.out.println("2");
		
		Test2 t = new Test2();
		t.a();
	
		System.out.println("end. ��������");

	}

}
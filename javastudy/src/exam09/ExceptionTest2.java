package exam09;


class Test{
	
	public void a() {
		System.out.println("Test.a");
		//���� �۾�
		int num = 0;
		int result= 10/num;  // ���� �߻� ==> ���������� ��.
		System.out.println("�����:" + result);
	}
}

public class ExceptionTest2 {

	public static void main(String[] args) {
		// ��������
		System.out.println("1");
		System.out.println("2");
		
		Test t = new Test();
		t.a();
	
		System.out.println("end. ��������");

	}

}
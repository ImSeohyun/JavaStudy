package exam09;


class Test3{
	
	public void a() {
		System.out.println("Test.a");
		//���� �۾�
		try {
			
			// ArithmeticException �߻� ������ �ڵ�
			int num = 2;
			int result= 10/num;  
			System.out.println("�����:" + result);
			
			// NullPointerException �߻� ������ �ڵ�
			String n=null;
			System.out.println(n.length());
			
		}catch(ArithmeticException e) {  
			System.out.println("error: 0 ���� ������ �߻�");
		}catch(NullPointerException e) {  
			System.out.println("error: ��ü ���� �ʿ�");
		}catch(Exception e) {  // ���������� ���� �������� ����Ѵ�.
			System.out.println("error �߻�");
		}finally {
			System.out.println("������ ����Ǵ� ����. �Ϲ������� �ܺ�����/DB��  close �۾�����");
		}
		
	}
}

public class ExceptionTest4 {

	public static void main(String[] args) {
		// ��������
		System.out.println("1");
		System.out.println("2");
		
		Test3 t = new Test3();
		t.a();
	
		System.out.println("end. ��������");

	}

}
package exam02;

public class OperatorTest4 {

	public static void main(String[] args) {
		
		//4. �������� (���� ����� ����)
		//js ó�� ������ ���� �������� ��� �Ұ�
		
		//��. &&
		System.out.println(true && true); //f
		System.out.println(true && false); //f
		System.out.println(false && true); //t 
		System.out.println(false && false); //t
		System.out.println();
		
		//��. || 
		System.out.println(true || true); //t
		System.out.println(true || false); //t
		System.out.println(false || true); //t
		System.out.println(false || false); //f
		System.out.println();
		
		
		//��. ! ( ���� )
		System.out.println(!true); //f
		System.out.println(!false); //t
	}
}

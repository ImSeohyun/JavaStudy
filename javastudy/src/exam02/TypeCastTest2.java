package exam02;

public class TypeCastTest2 {

	public static void main(String[] args) {
		
		//1. ������ ����ȯ
		
		//��. byte > short > int > long > float > double
		
		//ū Ÿ�� = ���� Ÿ��;�� ���¸� ��� ����ȯ�̴� ����
		
		byte b =10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float f = b4;
		double f2 = f;
		double f3 = b;
		
		//�ݴ� ���� ����
		float x = 3.14f;
		//int x2 = x;
		
		
		//��. char -> int (�ƽ�Ű�ڵ� ��)
		char c = 'A'; //65
		char c2 = 'a'; //97
		int n =c;
		int n2 = c2;
		System.out.println(n+" "+ n2);
		System.out.println('A'+1); //���ڴ� ���갡��
		
		//��. int ���� ���� ���������� ������ int�� ��ȯ
		short s =10;
		short s2 =10;
		//short s3 = s + s2; short=int �������� ó����
		
		//��. Ÿ�԰� ����Ÿ���� ������ ūŸ������ ��ȯ
		float ff = 3.14F;
		int nn = 10;
		float ff2 = ff + nn;
	}
}

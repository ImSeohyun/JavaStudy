package exam02;

public class OperatorTest {

	public static void main(String[] args) {
		
		//1. ���������
		int n =10;
		int n2 =3;
		
		System.out.println(n+n2);
		System.out.println(n-n2);
		System.out.println(n*n2);
		
		System.out.println(n/n2); //�� ��ȯ
		System.out.println(n /3.0);//�Ҽ������� ��ȯ 3.33333
		
		System.out.println(n%n2);
		
		// + ���Ῥ���ڷμ� ��밡��
		String k = 10+20+30+"hello";
		String k2 = "hello"+1+2+3;
		System.out.println(k);
		System.out.println(k2);
	}
}

package exam02;

public class OperatorTest5 {

	public static void main(String[] args) {
		
		//5. ���������� ( ���� ������: ++  , ���� ������: -- )
		
		
			//��ġ ������
			int n = 10;
			++n;
			System.out.println(n);
			
			//��ġ ������
			int n2 =10;
			n2--;
			System.out.println(n2);
			
			// ������ ��: �ٸ� �����ڿ� ���� ����� ��
			int m = 10;
			int result = ++m; //��ġ
			System.out.println(m +"\t" + result); // 11  11
			
			int m2 = 10;
			int result2 = m2++; //��ġ
			System.out.println(m2 +"\t" + result2); // 11  10
			
			//�޼��� ȣ��
			System.out.println(a());
			System.out.println(a2());
			
	}
	public static int a() {
		int x= 10;
		return ++x;
	}
	
	public static int a2() {
		int x= 10;
		return x++;
	}
	
}

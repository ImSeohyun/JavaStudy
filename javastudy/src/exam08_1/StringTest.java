package exam08_1;

public class StringTest {

	public static void main(String[] args) {
		
		//1. String Ŭ���� �̿��� ���ڿ� ����
		
		//��. ���ͷ� �̿�(�Ϲ���) -> ���� ���ڿ��̸� ����(�ּ� ����)
		String s = "hello";
		String s2 = "hello";
		
		
		//��. new �̿� -> ���� ���ڿ��̶� �Ź� ����
		String x = new String("hello");
		String x2 = new String("hello");
		
		System.out.println(s);
		System.out.println(x);
		System.out.println(s==s2); //true
		System.out.println(x==x2); //false
		//���ڿ� �񱳴� ����� == �ϸ� �ȵȴ�. �ݵ��  equals �޼��� ����ؾ���
		System.out.println(s.equals(s2));
	}
}

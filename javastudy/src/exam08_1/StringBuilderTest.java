package exam08_1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//StringBuilder Ŭ���� �̿��� ���ڿ� ���� -> ���۷� ���۵ż� �ڽ��� ���ڿ��� �����
		StringBuffer b = new StringBuffer("HeLLo");
		
		//�޼���
		System.out.println("1. �߰�:"+ b.append("hello"));
		System.out.println("1. �߰�:"+ b.append(10));
		System.out.println("1. �߰�:"+ b.append(4.12));
		
		System.out.println("2. ����:"+ b.insert(0, "hong"));
		System.out.println("2. ����:"+ b.insert(0, 100));
		
		System.out.println("3. ����:"+b.delete(0, 6));//0~5���� ����
		
		//charAt, substring,indexof ����
		System.out.println("4. �Ųٷ�:"+b.reverse());
		
		System.out.println(b);
		//���� ������ �۾��� String���� �����ؼ� ���ȴ�
		String s = b.toString();
		System.out.println("�������:"+s);
		
	}
}

package exam01;

public class StringFormatTest {

	public static void main(String[] args) {
		
		//���� ���
		
		//1. String.format(String ���Ĺ���, Object...����)
		String result = String.format("�̸�:%s, ����:%d, Ű:%f,����:%c,��ȥ����:%b", "ȫ�浿", 20, 167.23, '��', true);	
		String result2 = String.format("�̸�:%s, ����:%d, Ű:%.2f,����:%c,��ȥ����:%b", "ȫ�浿", 20, 167.23, '��', true);	
		System.out.println(result);
		System.out.println(result2);
		
		//2. System.out.printf(String ���Ĺ���, Object...����)
		System.out.printf("�̸�:%s, ����:%d, Ű:%.2f,����:%c,��ȥ����:%b \n", "ȫ�浿", 20, 167.23, '��', true);
		
		//printf�� �ٹٲ��� ������ \n�� �������� �� �ٹٲٱ� ����
		System.out.printf("�̸�:%s, ����:%d, Ű:%.2f,����:%c,��ȥ����:%b", "ȫ�浿", 20, 167.23, '��', true);

	}
}

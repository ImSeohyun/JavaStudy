package exam08_1;

public class WrapperTest {

	public static void main(String[] args) {
		
		//�⺻�� 8���� �ش�Ǵ� Ŭ������(wrapper Ŭ����)
		
		//1. int ���� (4byte)
		System.out.println("�ּҰ�:"+ Integer.MIN_VALUE);
		System.out.println("�ּҰ�:"+ Integer.MAX_VALUE);
		
		//2. "10" -> 10
		System.out.println("���� ��ȯ: "+(Integer.parseInt("10")+1));
		
		//3. "3.14" -> 3.14
		//�Ǽ������� ��Ȯ�ϰ� �������� �ʴ´� -> �ذ�:bigdecimal �̿�
		System.out.println("�Ǽ� ��ȯ"+ (Float.parseFloat("3.14")+1));
		
		//4. �ִ�, �ּ�, �հ�
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		System.out.println(Integer.sum(10, 20));
		
	}
}

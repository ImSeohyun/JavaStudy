package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest5 {

	public static void main(String[] args) {
		
		//set �迭: ���� ���� �ߺ� �Ұ��� �ڷᱸ��
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<>();
		
		// ����: �̸��� ������ ���̴�.
				set.add("ȫ�浿1");
				set.add("ȫ�浿2");
				set.add("ȫ�浿3");
				
		//set �޼��� ����
		System.out.println("ũ��: "+set.size());
		System.out.println("�� ���翩��: "+set.contains("ȫ�浿1"));
		System.out.println("�� ���翩��: "+set.contains("�̼���"));
		System.out.println("����ֳ�: "+set.isEmpty());
		
		set.remove("ȫ�浿3"); //ȫ�浿3 ����

		set.clear();//��ü ����
				
		//��¹�� - toString()�̿�
		System.out.println(set);	
		
		
		
	}
}

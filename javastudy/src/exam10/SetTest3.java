package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		//set �迭: ���� ���� �ߺ� �Ұ��� �ڷᱸ��
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<>();
		
		// ����: �̸��� ������ ���̴�.
				set.add("ȫ�浿1");
				set.add("ȫ�浿2");
				set.add("ȫ�浿3");
				
		//set.add(10);
		
		//��¹�� - toString()�̿�
		System.out.println(set);				

		//��¹��2 - for each��
		for (String obj : set) {  // obj�� �ƴ� string���� ���� �� ����
			//String str = (String)obj;
			System.out.println(">>" + obj.concat(" ��"));
		}
		
		//��¹��3 - Iterator �̿� ==> �÷��ǿ� ����� �����͸� �ݺ������� �������� ��� 
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("###"+str);
		}
		
		
		/*
		 * ���ʸ��� ����
		 * 1) �߸��� ������ ������ ���� ������ ������ �� �� �ִ�
		 * 2) ����ȯ �ʿ�x
		 * 
		 */
		
		
		
	}
}

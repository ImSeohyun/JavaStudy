package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		
		//set �迭: ���� ���� �ߺ� �Ұ��� �ڷᱸ��
		HashSet set = new HashSet();
		
		// ����: �̸��� ������ ���̴�.
				set.add("ȫ�浿1");
				set.add("ȫ�浿2");
				set.add("ȫ�浿3");
				
		//set.add(10);
		
		for (Object obj : set) {  // ������
			String str = (String)obj;
			System.out.println(">>" + str.concat(" ��"));
		}
		/*
		 * ���ʸ��� �Ⱦ���
		 * 1) �߸��� ������ ������ ���� ��������� �� �� �ִ�
		 * 2) ������ ����ȯ �ʿ�
		 * 
		 */
		
		
		
	}
}

package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		
		//set �迭: ���� ���� �ߺ� �Ұ��� �ڷᱸ��
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<>();
		
		// ����: �̸��� ������ ���̴�.
				set.add(1); //����ڽ�
				set.add(20); //����ڽ�
//				set.add("hi"); //����
				
		for (int i : set) {  // ���� ��ڽ�
			System.out.println(">>" +i);
		}
		
		Iterator<Integer> ite= set.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.println("###+num");
		}
		
		
		
	}
}

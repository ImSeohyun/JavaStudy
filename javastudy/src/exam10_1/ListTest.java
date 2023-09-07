package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		
		//List �迭: ���� �ְ� �ߺ� ����
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ȫ�浿");
		list.add("������");
		list.add("�̼���");
		list.add("ȫ�浿");
		
		//��¹�� - toString()�̿�
		System.out.println(list);				

		//��¹��2 - for each��
		for(String s : list) {
			System.out.println(">> "+s);
		}
		
		//��¹��3 - iterator �̿�
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String x = ite.next();
			System.out.println("## "+x);
		}
		
		//��¹��4 - index �̿�, list.get(idx)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
}

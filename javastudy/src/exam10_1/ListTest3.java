package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		//List �迭: ���� �ְ� �ߺ� ����
		
		List<String> list = new ArrayList<>(); //������ �༭ ���� ����� �Ϲ���
		
		list.add("ȫ�浿");
		list.add("������");
		list.add("�̼���");
		list.add("ȫ�浿");

		//�Ϲ������� ���� ����ϴ� ���
		List<String> list2 = Arrays.asList("ȫ�浿","�̼���","������");
		System.out.println(list2);
		
		System.out.println(list);				

		/*
		 *    Arrays API
		 *    1) Arrays.toString(�迭);
		 *    2) Arrays.asList(��,��2,��3,...);
		 *    
		 */
	}
}

package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); //������ �༭ ���� ����� �Ϲ���
		list.add("ȫ�浿");
		list.add("������");
		list.add("�̼���");
		list.add("ȫ�浿");

		//ȫ�浿 ����
		list.removeAll(Arrays.asList("ȫ�浿")); //list.removeAll(collection)
		
		System.out.println(list);
	}
}

package exam10_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		//List �迭: ���� �ְ� �ߺ� ����
		
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> list = new ArrayList<>(); //������ �༭ ���� ����� �Ϲ���
		
		list.add("ȫ�浿");
		list.add("������");
		list.add("�̼���");
		list.add("ȫ�浿");

		//�޼��� ����
		System.out.println("ũ��: "+list.size());
		
		//����
		list.set(2, "�����");
		
		//����
		list.add(0,"������");
		
		//����
		list.remove(1);//��ġ�� ����
		list.remove("������");//������ ����, �ߺ��������� ù��°�� ����
		//��� ���� - removeAll()
		
		//�κи���Ʈ
		List<String> sublist = list.subList(0, 2);//0~1
		System.out.println(sublist);
		
		//��¹�� - toString()�̿�
		System.out.println(list);				

				
	}
}

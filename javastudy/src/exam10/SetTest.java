package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		//set �迭: ���� ���� �ߺ� �Ұ��� �ڷᱸ��
		HashSet set = new HashSet();
		
		set.add("ȫ��");
		set.add(10); //�ڵ����� auto boxing
		set.add(3.14);//�ڵ����� auto boxing
		set.add('A');//�ڵ����� auto boxing
		set.add(true);//�ڵ����� auto boxing
		
		set.add("ȫ��");
		set.add(10); //�ڵ����� auto boxing
		set.add(3.14);//�ڵ����� auto boxing
		set.add('A');//�ڵ����� auto boxing
		set.add(true);//�ڵ����� auto boxing

		//��¹�� - toString()�̿�
		System.out.println(set);
		
		//��¹��2 - for each��
		for (Object object : set) { //���������� �� �ޱ� ���� Object�� �޾ƾ���
			System.out.println(">>"+object);
			
		}
		//��¹��3 - Iterator �̿� ==> �÷��ǿ� ����� �����͸� �ݺ������� �������� ��� 
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("###"+ite.next());
		}
		
		
		
	}
}

package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		Random r = new Random();
		for(int i=1;i<=10;i++) {
			list1.add(r.nextInt(9));
			list2.add(r.nextInt(9));
		}
		for(int i=0;i<10;i++){
			 // ù ��° ArrayList�� 1�������� 10��°������ ���ڸ� �� ��° ArrayList��
			// 1�������� 10��°������ ���ڷ� ������ ���� ó���� ���� �Ѵ�.
			try {
				System.out.println(list1.get(i)+"/"+list2.get(i)+" "+list1.get(i)/list2.get(i));			
			}catch(ArithmeticException e) {  // ������ Ŭ����, ������ ���� ����
				System.out.println(list1.get(i)+"/"+list2.get(i)+" �и� 0�Դϴ�");			
			}
			
		}
	}
}

package workshop07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {

	public static void main(String[] args) {
		
		 int size = Integer.parseInt(args[0]);
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 HashSet<Integer> set = new HashSet<Integer>();
		 // ArrayList�� size��ŭ�� ���� ��ŭ ������ ���ڸ� �ִ´�.
		 Random r = new Random();
		 for(int i=0;i<size;i++){
			 list.add(r.nextInt(20)+10);
		}
		 System.out.println(list);
		 // ArrayList ������ HashSet�� �ִ´�.
		for(int i:list){
			set.add(i);
		} 
		System.out.println(set);
		
	}
}

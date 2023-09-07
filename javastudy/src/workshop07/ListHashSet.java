package workshop07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {

	public static void main(String[] args) {
		
		 int size = Integer.parseInt(args[0]);
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 HashSet<Integer> set = new HashSet<Integer>();
		 // ArrayList에 size만큼의 개수 만큼 랜덤한 숫자를 넣는다.
		 Random r = new Random();
		 for(int i=0;i<size;i++){
			 list.add(r.nextInt(20)+10);
		}
		 System.out.println(list);
		 // ArrayList 정보를 HashSet에 넣는다.
		for(int i:list){
			set.add(i);
		} 
		System.out.println(set);
		
	}
}

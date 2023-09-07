package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest4 {

	public static void main(String[] args) {
		
		//set 계열: 순서 없고 중복 불가한 자료구조
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<>();
		
		// 가정: 이름만 저장할 것이다.
				set.add(1); //오토박싱
				set.add(20); //오토박싱
//				set.add("hi"); //에러
				
		for (int i : set) {  // 오토 언박싱
			System.out.println(">>" +i);
		}
		
		Iterator<Integer> ite= set.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			System.out.println("###+num");
		}
		
		
		
	}
}

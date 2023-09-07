package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest5 {

	public static void main(String[] args) {
		
		//set 계열: 순서 없고 중복 불가한 자료구조
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<>();
		
		// 가정: 이름만 저장할 것이다.
				set.add("홍길동1");
				set.add("홍길동2");
				set.add("홍길동3");
				
		//set 메서드 정리
		System.out.println("크기: "+set.size());
		System.out.println("값 존재여부: "+set.contains("홍길동1"));
		System.out.println("값 존재여부: "+set.contains("이순신"));
		System.out.println("비어있나: "+set.isEmpty());
		
		set.remove("홍길동3"); //홍길동3 삭제

		set.clear();//전체 삭제
				
		//출력방법 - toString()이용
		System.out.println(set);	
		
		
		
	}
}

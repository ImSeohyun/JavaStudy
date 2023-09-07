package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		//List 계열: 순서 있고 중복 가능
		
		List<String> list = new ArrayList<>(); //다형성 줘서 쓰는 방식이 일방적
		
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("홍길동");

		//일반적으로 많이 사용하는 방법
		List<String> list2 = Arrays.asList("홍길동","이순신","유관순");
		System.out.println(list2);
		
		System.out.println(list);				

		/*
		 *    Arrays API
		 *    1) Arrays.toString(배열);
		 *    2) Arrays.asList(값,값2,값3,...);
		 *    
		 */
	}
}

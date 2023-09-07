package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); //다형성 줘서 쓰는 방식이 일방적
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("홍길동");

		//홍길동 삭제
		list.removeAll(Arrays.asList("홍길동")); //list.removeAll(collection)
		
		System.out.println(list);
	}
}

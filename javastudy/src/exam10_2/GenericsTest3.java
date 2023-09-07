package exam10_2;

import java.util.ArrayList;
import java.util.List;

//<?>
public class GenericsTest3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		
		printData(list2);
	}
	
	public static void printData(List<?> xxx) {//리스트 타입의 제너릭 다 받아준다
		System.out.println(xxx);
		
	}
}

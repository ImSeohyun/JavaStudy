package exam10_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		//List 계열: 순서 있고 중복 가능
		
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> list = new ArrayList<>(); //다형성 줘서 쓰는 방식이 일방적
		
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("홍길동");

		//메서드 정리
		System.out.println("크기: "+list.size());
		
		//수정
		list.set(2, "정약용");
		
		//삽입
		list.add(0,"강감찬");
		
		//삭제
		list.remove(1);//위치로 삭제
		list.remove("강감찬");//값으로 삭제, 중복값있으면 첫번째만 삭제
		//모두 삭제 - removeAll()
		
		//부분리스트
		List<String> sublist = list.subList(0, 2);//0~1
		System.out.println(sublist);
		
		//출력방법 - toString()이용
		System.out.println(list);				

				
	}
}

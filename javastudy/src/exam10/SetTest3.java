package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		//set 계열: 순서 없고 중복 불가한 자료구조
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set2 = new HashSet<>();
		
		// 가정: 이름만 저장할 것이다.
				set.add("홍길동1");
				set.add("홍길동2");
				set.add("홍길동3");
				
		//set.add(10);
		
		//출력방법 - toString()이용
		System.out.println(set);				

		//출력방법2 - for each문
		for (String obj : set) {  // obj가 아닌 string으로 받을 수 있음
			//String str = (String)obj;
			System.out.println(">>" + obj.concat(" 님"));
		}
		
		//출력방법3 - Iterator 이용 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법 
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("###"+str);
		}
		
		
		/*
		 * 제너릭스 쓰면
		 * 1) 잘못된 데이터 저장한 것을 컴파일 시점에 알 수 있다
		 * 2) 형변환 필요x
		 * 
		 */
		
		
		
	}
}

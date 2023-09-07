package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		//set 계열: 순서 없고 중복 불가한 자료구조
		HashSet set = new HashSet();
		
		set.add("홍길");
		set.add(10); //자동으로 auto boxing
		set.add(3.14);//자동으로 auto boxing
		set.add('A');//자동으로 auto boxing
		set.add(true);//자동으로 auto boxing
		
		set.add("홍길");
		set.add(10); //자동으로 auto boxing
		set.add(3.14);//자동으로 auto boxing
		set.add('A');//자동으로 auto boxing
		set.add(true);//자동으로 auto boxing

		//출력방법 - toString()이용
		System.out.println(set);
		
		//출력방법2 - for each문
		for (Object object : set) { //다형성으로 다 받기 위해 Object로 받아야함
			System.out.println(">>"+object);
			
		}
		//출력방법3 - Iterator 이용 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법 
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("###"+ite.next());
		}
		
		
		
	}
}

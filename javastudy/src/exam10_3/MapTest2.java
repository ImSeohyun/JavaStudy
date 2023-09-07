package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		
		//map은 순서가 없다
		HashMap<String,String> map2 = new HashMap<String, String>();
		HashMap<String,String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "유관순");
		map.put("p3", "이순신");
		map.put("p3", "강감찬");//key 중복 시 덮어쓴다

		//메서드
		System.out.println(map.size());
		map.replace("p3", "세종");
		
		map.remove("p3");
		map.clear(); //전체 삭제
		
		//출력방법1 - toString
		System.out.println(map);

	}
}

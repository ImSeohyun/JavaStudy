package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//map은 순서가 없다
		HashMap<String,String> map2 = new HashMap<String, String>();
		HashMap<String,String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "유관순");
		map.put("p3", "이순신");
		map.put("p3", "강감찬");//key 중복 시 덮어쓴다
		
		//출력방법1 - toString
		System.out.println(map);

		//출력방법2 - get(key) 
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4")); //key없으면 null이 나옴
		
		//출력방법3 - keySet() -> key 값 반환(주로 키 많을때)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
	}
}

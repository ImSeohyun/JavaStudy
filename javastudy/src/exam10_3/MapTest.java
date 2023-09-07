package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//map�� ������ ����
		HashMap<String,String> map2 = new HashMap<String, String>();
		HashMap<String,String> map = new HashMap<>();
		
		map.put("p1", "ȫ�浿");
		map.put("p2", "������");
		map.put("p3", "�̼���");
		map.put("p3", "������");//key �ߺ� �� �����
		
		//��¹��1 - toString
		System.out.println(map);

		//��¹��2 - get(key) 
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4")); //key������ null�� ����
		
		//��¹��3 - keySet() -> key �� ��ȯ(�ַ� Ű ������)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
	}
}

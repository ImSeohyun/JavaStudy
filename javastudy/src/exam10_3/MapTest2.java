package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		
		//map�� ������ ����
		HashMap<String,String> map2 = new HashMap<String, String>();
		HashMap<String,String> map = new HashMap<>();
		
		map.put("p1", "ȫ�浿");
		map.put("p2", "������");
		map.put("p3", "�̼���");
		map.put("p3", "������");//key �ߺ� �� �����

		//�޼���
		System.out.println(map.size());
		map.replace("p3", "����");
		
		map.remove("p3");
		map.clear(); //��ü ����
		
		//��¹��1 - toString
		System.out.println(map);

	}
}

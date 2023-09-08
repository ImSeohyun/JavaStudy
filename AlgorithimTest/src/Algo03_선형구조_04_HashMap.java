import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Algo03_��������_04_HashMap {

	public static void main(String[] args) {

		//HashMap ���� ( �⺻������ ������� ���� ���� )
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		
		//iterate
		// 1. m.forEach(BiConsumer)
		m.forEach((key,value)->System.out.println(key+"="+value));
		System.out.println();
		
		// 2. key��.forEach(Consumer)
		m.keySet().forEach(key->System.out.println(key+"="+m.get(key)));
		
	}
}





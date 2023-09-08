import java.util.LinkedHashMap;

public class Algo03_��������_05_LinkedHashMap {

	public static void main(String[] args) {

		//LinkedHashMap ���� ( �⺻������ ������� ������ )
		// with predictable iteration order
		LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
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





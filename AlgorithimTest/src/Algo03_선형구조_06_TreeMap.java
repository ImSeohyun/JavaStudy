import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Algo03_��������_06_TreeMap {

	public static void main(String[] args) {

		// TreeMap ���� ( �⺻������ key�������� �������� ���ĵ� )
//		TreeMap<String, String> m = new TreeMap<>(); // ��ҹ��� ������ �������� ���� {A=AAA, B=BBB, E=EEE, ab=ab, c++=c++c++, d=ddd}
//		SortedMap<String, String> m = new TreeMap<>(Comparator.reverseOrder()); // ��ҹ��� ������ �������� ���� {d=ddd, c++=c++c++, ab=ab, E=EEE, B=BBB, A=AAA}
		SortedMap<String, String> m = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // ��ҹ��� �������� ���� �������� ���� {A=AAA, ab=ab, B=BBB, c++=c++c++, d=ddd, E=EEE}
		m.put("A", "AAA");
		m.put("ab", "ab");
		m.put("B", "BBB");
		m.put("c++", "c++c++");
		m.put("d", "ddd");
		m.put("E", "EEE");
		
		// A: 65  a:97
		System.out.println(m); // 
	}
}





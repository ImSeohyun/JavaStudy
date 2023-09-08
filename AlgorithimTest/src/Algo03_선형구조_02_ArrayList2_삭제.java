import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_��������_02_ArrayList2_���� {

	public static void main(String[] args) {

		//ArrayListŬ����
		List<String> x = new  ArrayList<String>();
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");		
		
		String str = x.remove(5);	//idx �̿�
		System.out.println(str);
		
		boolean b = x.remove("Kotlin"); //value �̿�
		System.out.println(b);
		
		x.removeIf(s->s.startsWith("C")); //C�� �����ϴ� �� ����
		System.out.println(x); //[Java, Python]
		
		//������ ���� List�� �����ϰ� �� List���� �̿��� ����
		List<String> xx = new  ArrayList<String>();
		xx.add("Java");
		
		x.removeAll(xx);
		System.out.println(x); //[Python]
	}
}

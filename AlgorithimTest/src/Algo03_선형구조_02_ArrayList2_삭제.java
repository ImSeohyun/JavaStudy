import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algo03_선형구조_02_ArrayList2_삭제 {

	public static void main(String[] args) {

		//ArrayList클래스
		List<String> x = new  ArrayList<String>();
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");		
		
		String str = x.remove(5);	//idx 이용
		System.out.println(str);
		
		boolean b = x.remove("Kotlin"); //value 이용
		System.out.println(b);
		
		x.removeIf(s->s.startsWith("C")); //C로 시작하는 값 삭제
		System.out.println(x); //[Java, Python]
		
		//삭제할 값을 List에 지정하고 이 List값을 이용해 삭제
		List<String> xx = new  ArrayList<String>();
		xx.add("Java");
		
		x.removeAll(xx);
		System.out.println(x); //[Python]
	}
}

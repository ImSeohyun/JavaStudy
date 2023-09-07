package workshop07;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<String>();
		
		String[] arr = args[0].split("");
		
		for(String str:arr) {
			s.add(str);
		}
		System.out.println(s);
		
	}
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Algo03_선형구조_02_ArrayList3_iterate {

	public static void main(String[] args) {

		//Arrays클래스
		List<String> x = new  ArrayList<String>();
		x.add("C");
		x.add("C++");
		x.add("Java");
		x.add("Kotlin");
		x.add("Python");
		x.add("SQL");		
		
		//1. forEach(Consumer)
		x.forEach(System.out::println);
		System.out.println();
		 
		//2. iterator
		Iterator<String> ite = x.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println();
		
		//3. ListIterator -> 시작 위치 지정 가능. 따라서 역순으로 접근 가능
		ListIterator<String> ite2 = x.listIterator(x.size());//idx 아닌 위치값. specified postition in the list
		while(ite2.hasNext()) {
			System.out.println(ite2.previous());
		}
		System.out.println();
		
		//4.foreach문
		for(String s:x) {
			System.out.println();
		}
		System.out.println();
		
		//5.일반 for문
		for(int i=0;i<x.size();i++) {
			System.out.println(x.get(i));
		}
		
	}
}

package exam02;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		//�Ķ���� �Ѱ�
		//�͸� Ŭ����
		Predicate<String> p = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()==5;
			}
		};
		System.out.println(p.test("hello"));
		
		//����
		Predicate<String> p2 = t -> t.length()==5;
		System.out.println(p2.test("hello"));
		
		////////IntPredicate/////////
		IntPredicate pp = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value>10;
			}
		};
		System.out.println(pp.test(5));
		
		//����
		IntPredicate ppp = value -> value>10;
		System.out.println(ppp.test(20));
		
		//�Ķ���� �ΰ�
		BiPredicate<String, Integer> a = new BiPredicate<String, Integer>() {
			@Override
			public boolean test(String t, Integer u) {
				return t.length()==u;
			}
		};
		System.out.println(a.test("hello", 5));
		
		BiPredicate<String, Integer> aa = (t,u) -> t.length()==u;
		System.out.println(aa.test("ahello", 5));
		
		
		
	}
}

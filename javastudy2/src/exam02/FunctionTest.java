package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionTest {

	public static void main(String[] args) {
		//파라미터 한 개
		//익명
		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		int n = f.apply("홍길동");
		System.out.println("문자열 길이 "+n);
		
		//람다
		Function<String, Integer> f2 = t -> t.length();
		System.out.println("문자열 길이 "+f2.apply("홍길동"));
		
		///////IntFunction////////
		IntFunction<Integer> x = new IntFunction<Integer>() {
			@Override
			public Integer apply(int value) {
				return value*2;
			}
		};
		System.out.println(x.apply(100));
		//람다
		IntFunction<Integer> x2 = value -> value*2;
		System.out.println(x2.apply(200));
		
		//파라미터 두 개
		BiFunction<String, Integer, String> k = new BiFunction<String, Integer, String>() {
			@Override
			public String apply(String t, Integer u) {
				return t.substring(0,u);
			}
		}; 
		System.out.println(k.apply("helloworld", 5));
		//람다
		BiFunction<String, Integer, String> k2 = (t,u) -> t.substring(0,u);
		System.out.println(k2.apply("helloworld", 2));
		
	}
}

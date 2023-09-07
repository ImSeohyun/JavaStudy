package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI_1_스트림생성 {
	public static void main(String[] args) {

		// 1. 컬렉션에 생성
		List<String> list = Arrays.asList("hong", "lee", "park");
		Stream<String> s = list.stream();
		System.out.println("스트림 요소 갯수: " + s.count());

		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};

		list.stream().forEach(c);
		System.out.println();
		
		//람다
		list.stream().forEach(t->System.out.println(t));
		System.out.println();
		
		//method reference
		list.stream().forEach(System.out::println);
		System.out.println("-------------------------");
		
		// 2. 배열에서 생성
		String[] names = {"hong", "lee", "park"};
		
		Stream<String> x = Stream.of(names);
		x.forEach(System.out::println);
		System.out.println();
		
		Stream<String> x2 = Arrays.stream(names);
		x2.forEach(System.out::println);
		
		//3.리터럴에서 Stream 생성
		Stream<String> y = Stream.of("hong", "lee", "park");
		y.forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> yy = Stream.of(1,2,3);
		yy.forEach(System.out::println);
		
		

	}
}

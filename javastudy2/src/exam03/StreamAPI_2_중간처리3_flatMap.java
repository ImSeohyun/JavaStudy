package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_2_중간처리3_flatMap {
	public static void main(String[] args) {

		/*
		 map(Function<T,R>)
		 
		 flatMap(Function<T,Stream>)
		 - 역할: 요소를 가공하여 복수 개의 요소들로 구성된 새로운 스트림 반환
		 */
		
		List<String> list = Arrays.asList("hello world","happy things");
		
		//실습1. 공백문자 기준으로 분리
		Function<String, Stream<? extends String>> mapper
		= new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<? extends String> apply(String t) {
				String[] names = t.split(" ");
				return Arrays.stream(names);
			}
		};
		
		list.stream()
			.flatMap(mapper)
			.forEach(System.out::println);
		System.out.println();
		//
		list.stream()
		.flatMap(t->Arrays.stream(t.split(" ")))
		.forEach(System.out::println);
		System.out.println("------------");
		
		//실습2: 쉼표 기준으로 분리 + 정수값으로 출력
		List<String> list2 = Arrays.asList("1,2,3","6,4,5");
		Function<String, IntStream> mapper2 = new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String[] arr = t.split(",");
				//문자배열을 숫자배열로
				int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
				return Arrays.stream(nums);
			}
		};
		
		list2.stream()
			.flatMapToInt(mapper2)
			.forEach(System.out::println);
		System.out.println();
		
		//람다
		list2.stream()
		.flatMapToInt(t->Arrays.stream(Arrays.stream(t.split(",")).mapToInt(Integer::parseInt).toArray()))
		.forEach(System.out::println);
	System.out.println();
	

	}//end main
}

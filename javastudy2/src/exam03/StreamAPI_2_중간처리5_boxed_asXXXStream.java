package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamAPI_2_중간처리5_boxed_asXXXStream {
	public static void main(String[] args) {
		/*
		 * boxed() - 기본형 -> 참조형
		 * 
		 * asDoubleStream() 
		 * - IntStream -> DoubleStream
		 * - LongStream -> DoubleStream
		 */

		int[] arr = {1,2,3,4,5};
		
		//1. boxed: int -> Integer
		IntStream s = Arrays.stream(arr);
		s.boxed()
		 .forEach(System.out::println);
		
		//2. asDoubleStream()
		Arrays.stream(arr)
			  .asDoubleStream()
			  .forEach(System.out::println);

	
	}
}

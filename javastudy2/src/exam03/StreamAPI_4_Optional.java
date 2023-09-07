package exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamAPI_4_Optional {
	public static void main(String[] args) {
		/*
			OptionalInt, OptionalDouble, OptionalLong
			
			역할: 컬렉션 값이 없을 경우 집계 메서드를 사용하면 예외 발생됨
				예외 방지 + default 값 설정하는 기능
		 */

		//1. 컬렉션에 값이 존재하는 경우
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		OptionalDouble avg = list.stream()
								 .mapToDouble(a->a)
								 .average();
		System.out.println(avg);//OptionalDouble[17.5]
		System.out.println(avg.getAsDouble());//17.5
		
		//2. 컬렉션에 값이 없는 경우
		List<Integer> list2 = new ArrayList<Integer>();
		
		OptionalDouble avg2 = list2.stream()
								 .mapToDouble(a->a)
								 .average();
		System.out.println(avg2);//OptionalDouble.empty
		//System.out.println(avg2.getAsDouble());//예외 발생
		System.out.println(avg2.orElse(0.0));//예외 발생 대신 0.0(기본값)출력
		
		
		
		
		

		
		
	}
}

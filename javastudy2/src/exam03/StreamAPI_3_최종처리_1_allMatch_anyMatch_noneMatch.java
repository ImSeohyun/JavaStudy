package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamAPI_3_최종처리_1_allMatch_anyMatch_noneMatch {
	public static void main(String[] args) {
		/*
		 * 최종처리 단계에서 요소들이 특정 조건에 만족여부 확인
		 * 
		 * 1.allMatch(Predicate): 모든 요소들이 Predicate 조건에 일치하는지 체크
		 * 2.anyMatch(Predicate): 일부분의 요소들이 Predicate 조건에 일치하는지 체크
		 * 3.noneMatch(Predicate): 모든 요소들이 Predicate 조건에 일치하지 않는지 체크
		 * 
		 * => 최종 결과는 boolean 값으로 반환
		 */

		int[] arr = {1,2,3,4,5};
		
		//1. allMatch
		//익명클래스
		IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int t) {
				return t <10;
			}
		}; 
		//모든 요소가 10보다 작은가
		boolean result = Arrays.stream(arr)
							   .allMatch(predicate);
		System.out.println("모든 요소가 10보다 작은가? "+result );
		
		//람다
		System.out.println(Arrays.stream(arr)
								 .allMatch(t->t<10));
		System.out.println();
		
		//2. anyMatch
		//요소 중에서 3의 배수가 있는가
		boolean result2 = Arrays.stream(arr)
								.anyMatch(t->t%3==0);
		System.out.println("요소 중에서 3의 배수가 있는가? "+result2 );
		System.out.println();

		//3. noneMatch
		//모든 요소 중에서 3의 배수가 업는가
		boolean result3 = Arrays.stream(arr)
				.noneMatch(t->t%3==0);
		System.out.println("모든 요소 중에서 3의 배수가 업는가? "+result3);
		
		
	}
}

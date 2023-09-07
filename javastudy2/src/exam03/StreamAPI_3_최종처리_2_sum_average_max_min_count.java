package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamAPI_3_최종처리_2_sum_average_max_min_count {
	public static void main(String[] args) {
		/*
		 * 통계처리
		 * IntStream, LongStream, DoubleStream의 집계 메서드
		 * 
		 * 합계 - sum
		 * 평균 - average
		 * 최대 - max 최소 - min
		 * 갯수 - count
		 */

		int[] arr = {1,2,3,4,5};
		
		//1. sum
		int sum = Arrays.stream(arr)
						.sum();
		System.out.println("합계"+sum);
		
		sum = Arrays.stream(arr)
					.filter(n->n%2==0)
					.sum();
		System.out.println("합계"+sum);
		
		

		//2. 평균
		double avg = Arrays.stream(arr)
						   .average()
						   .orElse(0.0);
		System.out.println("평균: "+avg);
		
		avg = Arrays.stream(arr)
				.filter(n->n%2==0)
				.average()
				.orElse(0.0);
		System.out.println("짝수의 평균: "+avg);
		
		//3. 최대
		int max = Arrays.stream(arr)
						.max()
						.orElse(0);
		System.out.println("최대: "+max);
		
		//4. 최소
		int min = Arrays.stream(arr)
				.min()
				.orElse(0);
		System.out.println("최소: "+min);
		
		//5. 갯수
		long count = Arrays.stream(arr)
					.count();
		System.out.println("갯수: "+count);
		
	}
}

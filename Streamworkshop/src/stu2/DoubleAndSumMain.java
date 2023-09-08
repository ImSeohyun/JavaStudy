package stu2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DoubleAndSumMain {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		//int sum = numbers.stream()
			//	.sum();
						//.map(t->t*2)
	}
}

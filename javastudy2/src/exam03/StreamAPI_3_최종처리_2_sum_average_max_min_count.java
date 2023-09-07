package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamAPI_3_����ó��_2_sum_average_max_min_count {
	public static void main(String[] args) {
		/*
		 * ���ó��
		 * IntStream, LongStream, DoubleStream�� ���� �޼���
		 * 
		 * �հ� - sum
		 * ��� - average
		 * �ִ� - max �ּ� - min
		 * ���� - count
		 */

		int[] arr = {1,2,3,4,5};
		
		//1. sum
		int sum = Arrays.stream(arr)
						.sum();
		System.out.println("�հ�"+sum);
		
		sum = Arrays.stream(arr)
					.filter(n->n%2==0)
					.sum();
		System.out.println("�հ�"+sum);
		
		

		//2. ���
		double avg = Arrays.stream(arr)
						   .average()
						   .orElse(0.0);
		System.out.println("���: "+avg);
		
		avg = Arrays.stream(arr)
				.filter(n->n%2==0)
				.average()
				.orElse(0.0);
		System.out.println("¦���� ���: "+avg);
		
		//3. �ִ�
		int max = Arrays.stream(arr)
						.max()
						.orElse(0);
		System.out.println("�ִ�: "+max);
		
		//4. �ּ�
		int min = Arrays.stream(arr)
				.min()
				.orElse(0);
		System.out.println("�ּ�: "+min);
		
		//5. ����
		long count = Arrays.stream(arr)
					.count();
		System.out.println("����: "+count);
		
	}
}

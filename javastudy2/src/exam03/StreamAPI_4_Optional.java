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
			
			����: �÷��� ���� ���� ��� ���� �޼��带 ����ϸ� ���� �߻���
				���� ���� + default �� �����ϴ� ���
		 */

		//1. �÷��ǿ� ���� �����ϴ� ���
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		OptionalDouble avg = list.stream()
								 .mapToDouble(a->a)
								 .average();
		System.out.println(avg);//OptionalDouble[17.5]
		System.out.println(avg.getAsDouble());//17.5
		
		//2. �÷��ǿ� ���� ���� ���
		List<Integer> list2 = new ArrayList<Integer>();
		
		OptionalDouble avg2 = list2.stream()
								 .mapToDouble(a->a)
								 .average();
		System.out.println(avg2);//OptionalDouble.empty
		//System.out.println(avg2.getAsDouble());//���� �߻�
		System.out.println(avg2.orElse(0.0));//���� �߻� ��� 0.0(�⺻��)���
		
		
		
		
		

		
		
	}
}

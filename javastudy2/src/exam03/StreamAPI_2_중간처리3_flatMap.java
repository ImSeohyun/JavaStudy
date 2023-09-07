package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_2_�߰�ó��3_flatMap {
	public static void main(String[] args) {

		/*
		 map(Function<T,R>)
		 
		 flatMap(Function<T,Stream>)
		 - ����: ��Ҹ� �����Ͽ� ���� ���� ��ҵ�� ������ ���ο� ��Ʈ�� ��ȯ
		 */
		
		List<String> list = Arrays.asList("hello world","happy things");
		
		//�ǽ�1. ���鹮�� �������� �и�
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
		
		//�ǽ�2: ��ǥ �������� �и� + ���������� ���
		List<String> list2 = Arrays.asList("1,2,3","6,4,5");
		Function<String, IntStream> mapper2 = new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String[] arr = t.split(",");
				//���ڹ迭�� ���ڹ迭��
				int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
				return Arrays.stream(nums);
			}
		};
		
		list2.stream()
			.flatMapToInt(mapper2)
			.forEach(System.out::println);
		System.out.println();
		
		//����
		list2.stream()
		.flatMapToInt(t->Arrays.stream(Arrays.stream(t.split(",")).mapToInt(Integer::parseInt).toArray()))
		.forEach(System.out::println);
	System.out.println();
	

	}//end main
}

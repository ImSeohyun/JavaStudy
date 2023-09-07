package exam03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI_2_�߰�ó��1_distinct_filter {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("hong", "lee", "park", "lee", "lim");

		// 1. �߰�ó�� (�ߺ����� - distinct)
		list.stream()
			.distinct()
			.forEach(System.out::println);
		System.out.println();

		// 2. �߰�ó�� (���͸� - filter)
		//�͸��Լ�
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("l");
			}
		};
		list.stream()
			.filter(predicate)
			.forEach(System.out::println);
		System.out.println();
		
		//����
		list.stream()
			.filter(t->t.startsWith("l"))
			.forEach(System.out::println);
		System.out.println();
		
		//3.ȥ�� (distinct + filter)
		list.stream()
			.distinct()
			.filter(t->t.startsWith("l"))
			.forEach(System.out::println);
		System.out.println();
	}
}

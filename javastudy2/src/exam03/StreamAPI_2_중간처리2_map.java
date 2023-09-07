package exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

class Student{
	String username;
	int score;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String username, int score) {
		this.username = username;
		this.score = score;
	}
	public Student() {}
	
	@Override
	public String toString() {
		return "Student [username=" + username + ", score=" + score + "]";
	}
}//end class

public class StreamAPI_2_�߰�ó��2_map {
	public static void main(String[] args) {

		/*
		 map(Function), mapToInt(ToIntFunction), mapToDouble, mapToLong
		 - ����: ��Ҹ� �����Ͽ� ���ο� ��Ʈ�� ��ȯ
		 */
		
		List<Student> list = Arrays.asList(new Student("hong",90),
										   new Student("lee",80),
										   new Student("park",100));
		//����1: �̸����� ���� ���
		Function<Student, String> mapper = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getUsername().substring(0,1);
			}
		};
		list.stream()
			.map(mapper)
			.forEach(System.out::println);
		
		//����
		list.stream()
			.map(t->t.getUsername().substring(0,1))
			.forEach(System.out::println);
		System.out.println();
		
		//����2. score ���� ���
		Function<Student, Integer> mapper2 = new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getScore();
			}
		};
		list.stream()
			.map(mapper2)
			.forEach(System.out::println);
		System.out.println();
		
		//����
		list.stream()
			.map(t->t.getScore())
			.forEach(System.out::println);
		System.out.println();
		//method reference
		list.stream()
			.map(Student::getScore)
			.forEach(System.out::println);
		
		// ����2. score���� ��� - mapToInt �̿�
		ToIntFunction<Student> mapper3 = new ToIntFunction<Student>() {
			
			@Override
			public int applyAsInt(Student t) {
				return t.getScore();
			}
		};
		
		list.stream()
			.mapToInt(mapper3)
			.forEach(System.out::println);
		System.out.println();
		//����
		list.stream()
		.mapToInt(t->t.getScore())
		.forEach(System.out::println);
		System.out.println();
		//method reference
		list.stream()
		.mapToInt(Student::getScore)
		.forEach(System.out::println);
		System.out.println();
		
		
	}//end main
}

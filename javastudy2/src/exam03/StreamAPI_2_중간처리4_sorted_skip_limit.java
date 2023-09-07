package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
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

	public Person(String username, int score) {
		this.username = username;
		this.score = score;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", score=" + score + "]";
	}
}// end class

public class StreamAPI_2_�߰�ó��4_sorted_skip_limit {
	public static void main(String[] args) {
		/*
		 * sorted() - ����
		 * 
		 * skip(n) - n���� skip
		 * 
		 * limit(n) - n���� ������
		 */

		List<Person> list = Arrays.asList(new Person("ȫ�浿1", 100), new Person("ȫ�浿2", 80), new Person("ȫ�浿3", 85),
				new Person("ȫ�浿4", 90), new Person("ȫ�浿5", 70));
		// ��������: PersonŬ������ score�� ����
		list.stream()
//			.sorted(Comparator.comparing(Person::getScore))
				.sorted(Comparator.comparingInt(Person::getScore)).forEach(System.out::println);
		System.out.println();

		// ��������: PersonŬ������ score�� ����
		list.stream().sorted(Comparator.comparing(Person::getScore, Comparator.reverseOrder()))
				.forEach(System.out::println);
		System.out.println();

		// 2. skip(n)- n���� skip
		list.stream().sorted(Comparator.comparingInt(Person::getScore)).skip(2).forEach(System.out::println);
		System.out.println();

		// 3. limit(n) - n���� ������
		list.stream()
				.sorted(Comparator.comparingInt(Person::getScore))
				.limit(3)
				.forEach(System.out::println);
		System.out.println();

	}
}

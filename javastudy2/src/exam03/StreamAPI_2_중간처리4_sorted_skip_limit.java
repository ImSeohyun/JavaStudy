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

public class StreamAPI_2_중간처리4_sorted_skip_limit {
	public static void main(String[] args) {
		/*
		 * sorted() - 정렬
		 * 
		 * skip(n) - n개를 skip
		 * 
		 * limit(n) - n개만 가져옴
		 */

		List<Person> list = Arrays.asList(new Person("홍길동1", 100), new Person("홍길동2", 80), new Person("홍길동3", 85),
				new Person("홍길동4", 90), new Person("홍길동5", 70));
		// 오름차순: Person클래스의 score값 기준
		list.stream()
//			.sorted(Comparator.comparing(Person::getScore))
				.sorted(Comparator.comparingInt(Person::getScore)).forEach(System.out::println);
		System.out.println();

		// 내림차순: Person클래스의 score값 기준
		list.stream().sorted(Comparator.comparing(Person::getScore, Comparator.reverseOrder()))
				.forEach(System.out::println);
		System.out.println();

		// 2. skip(n)- n개를 skip
		list.stream().sorted(Comparator.comparingInt(Person::getScore)).skip(2).forEach(System.out::println);
		System.out.println();

		// 3. limit(n) - n개만 가져옴
		list.stream()
				.sorted(Comparator.comparingInt(Person::getScore))
				.limit(3)
				.forEach(System.out::println);
		System.out.println();

	}
}

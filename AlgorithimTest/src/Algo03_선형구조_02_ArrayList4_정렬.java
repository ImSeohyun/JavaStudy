import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;


class Person{
	
	String username;
	int score;
	
	public Person() {}

	public Person(String username, int score) {
		this.username = username;
		this.score = score;
	}

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

	@Override
	public String toString() {
		return "Student [username=" + username + ", score=" + score + "]";
	}
	
}//end class
public class Algo03_��������_02_ArrayList4_���� {

	public static void main(String[] args) {
		/*
		   �迭�� ��ƿ��Ƽ Ŭ����: Arrays Ŭ����
		   �÷����� ��ƿ��Ƽ Ŭ����: Collections Ŭ����
		  
		*/
		//��. �⺻�� ������ ����
		List<Integer> x = new ArrayList<Integer>();
		x.add(3);
		x.add(13);
		x.add(23);
		x.add(4);
		x.add(5);
		
		//����
		Collections.sort(x); // ��������
		Collections.sort(x, Comparator.reverseOrder()); //��������
		
		System.out.println(x);
		
		//��. ������ ������ ����
		List<Person> list = Arrays.asList(new Person("ȫ�浿1", 100),
				new Person("ȫ�浿2", 80),
				new Person("ȫ�浿3", 85),
				new Person("ȫ�浿4", 90),
				new Person("ȫ�浿5", 70));
		
		Collections.sort(list, Comparator.comparing(Person::getScore)); //��������
		Collections.sort(list,
				 Comparator.comparing(Person::getScore, Comparator.reverseOrder())); //��������
		System.out.println(list);
		
	}
}
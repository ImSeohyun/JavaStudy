package exam03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Stu{
	
	String username;
	int grade;
	boolean isMale; //���ڳ�?
	int age;
	
	public Stu() {}

	public Stu(String username, int grade, boolean isMale, int age) {
		this.username = username;
		this.grade = grade;
		this.isMale = isMale;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [username=" + username + ", grade=" + grade + ", isMale=" + isMale + ", age=" + age + "]";
	}
}

public class StreamAPI_3_����ó��_3_collect {
	public static void main(String[] args) {
		/*
		 	collect(Collector<? super T,A,R> collector)
		 	-�Ķ������ Collecotr �������̽� ��ſ� Collector Ŭ���� ���
		 	-Collector Ŭ������ �޼���� static �޼����̹Ƿ�
		 	 Collectors.�޼��� �������� ���
		 
		 */
		
		Stu [] stuArr = { new Stu("ȫ�浿", 3, true, 25),
				 new Stu("�̼���", 1, true, 55),
				 new Stu("������", 2, false, 18),
				 new Stu("���߱�", 3, true, 31),
				 new Stu("ȫ����", 1, true, 58),
				 new Stu("������", 3, true, 44)
		 };
		
		//1. �̸��� ���
		Arrays.stream(stuArr)
			  .map(Stu::getUsername)
			  .forEach(System.out::println);
		System.out.println();

		//2. �̸��� list�� ����
		List<String> list = Stream.of(stuArr)
							  	  .map(Stu::getUsername)
							  	  .collect(Collectors.toList());
		System.out.println(list);
		
		//3. map���� ���� Map<�̸�, Stu>
		Function<Stu, String> keyMapper = new Function<Stu, String>() {
			@Override
			public String apply(Stu t) {
				return t.getUsername();
			}
		};
		Function<Stu, Stu> valueMapper = new Function<Stu, Stu>() {
			@Override
			public Stu apply(Stu t) {
				return t;
			}
		};
		
		Map<String, Stu> m = Stream.of(stuArr)
				.collect(Collectors.toMap(keyMapper, valueMapper));
		Set<String> keys = m.keySet();
		for(String key: keys) {
			System.out.println(key+"\t"+m.get(key));
		}
		System.out.println("---------------");
		//����
		Map<String, Stu> m2 = Stream.of(stuArr)
				//.collect(Collectors.toMap(t->t.getUsername(),t->t));
				.collect(Collectors.toMap(Stu::getUsername,t->t));
		
		Set<String> keys2 = m2.keySet();
		for(String key: keys2) {
			System.out.println(key+"\t"+m.get(key));
		}
		System.out.println();
		
		//4. ����
		long count = Stream.of(stuArr)
							.collect(Collectors.counting());
		System.out.println("4. ����: "+ count);
		
		//5. age�հ�
		int sum = Stream.of(stuArr)
						.collect(Collectors.summingInt(Stu::getAge));
		
		System.out.println("5. age�հ�: "+sum);
		
		//6. age�ִ밪
		Optional<Stu> max= Stream.of(stuArr)
			.collect(Collectors.maxBy(Comparator.comparing(Stu::getAge)));
		System.out.println("6. age�ִ밪: "+max.get());
		System.out.println("6. age�ִ밪: "+max.orElse(null));
		
		//7. age�ּҰ�
		Stu min= Stream.of(stuArr)
				.collect(Collectors.minBy(Comparator.comparing(Stu::getAge))).orElse(null);
		System.out.println("7. age�ּҰ�: "+min);
		
		/*
		 	collect(Collectors.partitioningBy(Predicate))
		 	-> true���� false�� ����� ��ȯ
		 	
		 	collect(Collectors.groupingBy(Function))
		 	-> Function�� ���ϰ����� �׷����ؼ� ��ȯ
		 */
		
		//8.���� �з�
		//�͸� Ŭ����
		Predicate<Stu> predicate = new Predicate<Stu>() {
			@Override
			public boolean test(Stu t) {
				return t.isMale();
			}
		};
		Map<Boolean,List<Stu>> xxx = Stream.of(stuArr)
									.collect(Collectors.partitioningBy(predicate));
		List<Stu> male = xxx.get(true);
		List<Stu> female = xxx.get(false);

		System.out.println("male "+male);
		System.out.println("female "+female);
		System.out.println("----------");
		
		//����
		Map<Boolean, List<Stu>> xxx2 
			= Stream.of(stuArr)
//					.collect(Collectors.partitioningBy(t->t.isMale));
					.collect(Collectors.partitioningBy(Stu::isMale));//method reference
		List<Stu> male2 = xxx2.get(true);
		List<Stu> female2 = xxx2.get(false);

		System.out.println("male "+male2);
		System.out.println("female "+female2);
		
		//9. grade �׷���
		//�͸�Ŭ����
		Function<Stu, Integer> classifier = new Function<Stu, Integer>() {
			@Override
			public Integer apply(Stu t) {
				return t.getGrade();
			}
		};
		
		Map<Integer, List<Stu>> yyy= Stream.of(stuArr)
			  .collect(Collectors.groupingBy(classifier));
		
		Set<Integer> keys3 =yyy.keySet();
		for(Integer key:keys3) {
			System.out.println(key+"="+yyy.get(key));
		}
		System.out.println("---------------");
		
		//grade �׷��� ���� ���ϱ�
		Map<Integer, Long> yyy2= Stream.of(stuArr)
				  .collect(Collectors.groupingBy(classifier,Collectors.counting()));
			
			Set<Integer> keys4 =yyy2.keySet();
			for(Integer key:keys4) {
				System.out.println(key+"="+yyy2.get(key));
			}
		
		
	}//end main
}

package exam04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이",2,"암컷");
	
		//출력 - 인스턴스 변수 직접 접근 (권장X)
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);

		//출력2- getter 메서드 이용 접근
		String name = c.getName();
		int age = c.getAge();
		String sex = c.getSex();

		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		
		//수정1 - 인스턴스 변수 직접 접근 (권장 X)
		c.age=3;
		System.out.println(c.getAge());
		
		//수정2 - setter 메서드 이용 수정
		c.setAge(3);
		c.setName("meow");
		c.setSex("male");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getSex());
	}
}

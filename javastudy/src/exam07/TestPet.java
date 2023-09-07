package exam07;

public class TestPet {

	public static void main(String[] args) {
		
		//1. 일반 객체 생성
		Cat c = new Cat("야옹이",2);
		Dog d = new Dog("멍멍이",1,"수컷");
		Bird b = new  Bird("짹짹이",1,"블랙");
		
		System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c.getName(), c.getAge());
		System.out.printf("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", d.getName(), d.getAge(), d.getSex() );
		System.out.printf("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", b.getName(), b.getAge(), b.getColor());

		System.out.println();
		//2. 다형성 생성
		Pet p = new Cat("야옹이",2);
			System.out.printf("Cat 이름: %s, Cat 나이:%d \n", c.getName(), c.getAge());
			p = new Dog("멍멍이",1,"수컷");
			System.out.printf("Dog 이름: %s, Dog 나이:%d \n", d.getName(), d.getAge());
			p = new  Bird("짹짹이",1,"블랙");
			System.out.printf("Bird 이름: %s, Bird 나이:%d \n" , b.getName(), b.getAge());
		
	}
}

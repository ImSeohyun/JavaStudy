package exam04_2;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		Cat c2 = new Cat("야옹",2);
		Cat c3= new Cat("meow",1,"male");
		
		/*
		 * 오버로딩 생성자 지원 이유?
		 * - 다양한 방법으로 생성하도록 지원
		 * 
		 * 기본생성자
		 * - 다른 생성자를 안 만든 경우에만 자동생성된다.
		 * 있을 경우 명시적으로 지정해야 된다.
		 * 
		 */
	}
}

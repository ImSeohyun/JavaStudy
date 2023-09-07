package exam07_2;

public class TestPet {

	public static void main(String[] args) {
		
		//1. 老馆 按眉 积己
		Cat c = new Cat("具克捞",2);
		Dog d = new Dog("港港捞",1,"荐钠");
		Bird b = new  Bird("卤卤捞",1,"喉发");
		
		System.out.println(c.toString());
		System.out.println(b.toString());
		System.out.println(d.toString());
		
	}
}

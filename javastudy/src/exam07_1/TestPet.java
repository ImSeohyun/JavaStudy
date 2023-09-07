package exam07_1;

import exam06_2.Cat;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("meow",1);

		System.out.println(c); //exam06_2.Cat@15db9742(林家蔼),
		System.out.println(c.toString());//林家蔼
	
	}
}

package exam04_1;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	//생성자(constructor): 인스턴스 변수 초기화
	//오버로딩 생성자 
	public Cat() {	} //기본 생성자
	public Cat(String n) {	}
	public Cat(int n) {	}
	public Cat(String a, int n) {}
	public Cat(int n, String a) {}
	
	public Cat(String name, int a, String s) {
		this.name = name; //this 생략 가능
		this.age = a;
		sex = s;
	}

}

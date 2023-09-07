package exam04;

public class TestPet {

	public static void main(String[] args) {
		
		//객체 생성
		// 클래스명 변수명 = new 클래스명();
		
		//고양이: 야옹이 2 암컷
		Cat c = new Cat();  //cat 클래스 메모리에 올림
		//멤버 접근
		c.name="야옹이";
		c.age=2;
		c.sex="female";
		System.out.println(c.name);
		
		//고양이: 냥이 1 수컷
		Cat c2 = new Cat();
		c.name="냥이";
		c.age=1;
		c.sex="male";
		System.out.println(c2.name);

	}
}

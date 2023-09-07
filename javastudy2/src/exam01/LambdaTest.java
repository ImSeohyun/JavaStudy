package exam01;


@FunctionalInterface
interface Flyer {
	//1. 파라미터 x, 리턴값 x
	public void fly();
}

public class LambdaTest {
	public static void main(String[] args) {
		
		//익명 클래스
		/*
		  인터페이스명 변수명 = new 인터페이스명(){
		  		//추상메서드 재정의
		  };
		 */
		
		Flyer f = new Flyer() {
			
			@Override
			public void fly() {
				System.out.println("flyer() fly");
			}
		};
		f.fly();
		
		//람다 표현식
		Flyer f2 = () -> {System.out.println("람다표현식 flyer() fly");};
		f2.fly();
		
	}
}

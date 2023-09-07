package exam01;


@FunctionalInterface
interface Flyer2 {
	//2. 파라미터 ㅇ, 리턴값 x
	public void fly(int n);
}

public class LambdaTest2 {
	public static void main(String[] args) {
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				System.out.println("flyer2 fly(int n)"+n);
			}
		};
		f.fly(10);
		
		//람다 표현식
		Flyer2 f2 = (int n) -> {
			System.out.println("람다flyer2 fly(int n)"+n);
		};
		f2.fly(20);
		
		//데이터타입 생략
		Flyer2 f3 =(n)-> {
			System.out.println("람다 flyer2 fly(int n)"+n);
		};
		f3.fly(10);

		//매개변수 하나면 ()생략 가능
		Flyer2 f4 = n-> {
			System.out.println("람다 flyer2 fly(int n)"+n);
		};
		f3.fly(10);
		
	}
}

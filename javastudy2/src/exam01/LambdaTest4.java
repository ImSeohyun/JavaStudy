package exam01;


@FunctionalInterface
interface Flyer4 {
	//2. 파라미터 o, 리턴값 o
	public int fly(int n, int n2);
}

public class LambdaTest4 {
	public static void main(String[] args) {

		Flyer4 f = new Flyer4() {
			@Override
			public int fly(int n,int n2) {
				return n+n2;
			}
		};
		System.out.println("result " + f.fly(1, 2));
		
		//람다 표현식
		Flyer4 f2 = (int n, int n2) -> {
			return n+n2;
		};
		Flyer4 f3 = (n, n2) -> {
			return n+n2;
		};
		//return 문장만 있으면 {}와 return 키워드 생략
		Flyer4 f4 = (n, n2)->n+n2;
		System.out.println("result " + f2.fly(10, 2));
	}
}

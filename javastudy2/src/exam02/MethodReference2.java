package exam02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Calculator2{
	//인스턴스 메서드
	public int methodA(int x, int y) {
		return x+y;
	}
}

public class MethodReference2 {
	public static void main(String[] args) {
		
		//2. 인스턴스 메서드 method reference
		//파라미터 있고 리턴타입 있음
		Calculator2 c = new Calculator2();
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return c.methodA(t, u);
			}
		};
		BinaryOperator<Integer> x2 =(t,u)->c.methodA(t, u);
		
		BinaryOperator<Integer> x3 = c::methodA;
		int result = x3.apply(100, 200);
		System.out.println(result);
		
		///API 클래스: String 클래스의 인스턴스 메서드 사용하는 경우
		UnaryOperator<String> y = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		UnaryOperator<String> y2 = t->t.toUpperCase();
		UnaryOperator<String> y3 = String::toUpperCase; //객체 생성 따로 안했기 때문에 String클래스 이름으로
		System.out.println(y3.apply("HellO"));
	}
}

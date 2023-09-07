package exam02;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {
	public static void main(String[] args) {
		//매개변수 한개
		//익명클래스
		UnaryOperator<String> x = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t+"~";
			}
		};
		System.out.println(x.apply("hello"));
		
		//람다
		UnaryOperator<String> x2 = t -> t+"~";
		System.out.println(x2.apply("hello"));
		
		////////IntUnaryOperator///////
		//익명
		IntUnaryOperator k = new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {
				return operand*2;
			}
		};
		System.out.println(k.applyAsInt(20));
		//람다
		IntUnaryOperator k2 = operand -> operand*2;
		System.out.println(k2.applyAsInt(20));
		
		//매개변수가 두 개
		BinaryOperator<Integer> kk = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		System.out.println(kk.apply(10, 20));
		//람다
		BinaryOperator<Integer> kkk = (t,u) -> t+u;
		System.out.println(kkk.apply(10, 20));
		
		
	}
}

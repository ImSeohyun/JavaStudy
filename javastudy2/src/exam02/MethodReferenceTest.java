package exam02;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class Calculator{
	public Calculator(){	
		System.out.println("Calculator ������");
	}
	public Calculator(int x) {
		System.out.println("Calculator ������");
	}
	public Calculator(int x,String x2) {
		System.out.println("Calculator ������");
	}
}

public class MethodReferenceTest {
public static void main(String[] args) {
	
	//������
	//1. �Ķ����x, ���ϰ�o (�⺻������)
	Supplier<Calculator> s = new Supplier<Calculator>() {
		@Override
		public Calculator get() {
			return new Calculator();
		}
	};
	
	//����
	Supplier<Calculator> s2 = ()->new Calculator();
	
	//method reference
	Supplier<Calculator> s3 = Calculator::new;
	Calculator c = s3.get();
	System.out.println(c);
	
	//2. �Ķ����o, ���ϰ�o. �Ķ���� �Ѱ� (public Calculator(int x))
	Function<Integer, Calculator> f = new Function<Integer, Calculator>() {
		@Override
		public Calculator apply(Integer t) {
			return new Calculator(t);
		}
	};
	//����
	Function<Integer, Calculator> f2 = t -> new Calculator(t);
	//method reference
	Function<Integer, Calculator> f3 = Calculator::new;
	Calculator c2 = f3.apply(100);
	System.out.println(c2);
	
	//3. �Ķ����o, ���ϰ�o. �Ķ���� 2�� (public Calculator(int x,String x2))
	BiFunction<Integer, String, Calculator> x = new BiFunction<Integer, String, Calculator>() {
		@Override
		public Calculator apply(Integer t, String u) {
			return new Calculator(t,u);
		}
	};
	BiFunction<Integer, String, Calculator> x2 = (t,u) -> new Calculator(t,u);
	BiFunction<Integer, String, Calculator> x3 = Calculator::new;
	Calculator c3 = x3.apply(100, "ȫ�浿");
	System.out.println(c3);
}
}

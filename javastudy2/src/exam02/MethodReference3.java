package exam02;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class Calculator3{
	//�ν��Ͻ� �޼���
	public static int methodA(int x, int y) {
		return x+y;
	}
}

public class MethodReference3 {
	public static void main(String[] args) {
		
		//3. static�޼��� method reference
		//�Ķ���� �ְ� ����Ÿ�� ����
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return Calculator3.methodA(t, u);
			}
		};
		BinaryOperator<Integer> x2 = (t,u)->Calculator3.methodA(t, u);
		BinaryOperator<Integer> x3 = Calculator3::methodA;
		System.out.println(x3.apply(100, 200));
		
		//API �� ��ǥ���� static �޼���
		//Integer.parseInt("10"), String.valueOf(10)
		Function<String, Integer> y = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		Function<String, Integer> yy = t->Integer.parseInt(t);
		Function<String, Integer> yyy = Integer::parseInt;
		System.out.println(yyy.apply("100"));
	}
}

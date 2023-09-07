package exam02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Calculator2{
	//�ν��Ͻ� �޼���
	public int methodA(int x, int y) {
		return x+y;
	}
}

public class MethodReference2 {
	public static void main(String[] args) {
		
		//2. �ν��Ͻ� �޼��� method reference
		//�Ķ���� �ְ� ����Ÿ�� ����
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
		
		///API Ŭ����: String Ŭ������ �ν��Ͻ� �޼��� ����ϴ� ���
		UnaryOperator<String> y = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		UnaryOperator<String> y2 = t->t.toUpperCase();
		UnaryOperator<String> y3 = String::toUpperCase; //��ü ���� ���� ���߱� ������ StringŬ���� �̸�����
		System.out.println(y3.apply("HellO"));
	}
}

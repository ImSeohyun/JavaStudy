package exam02;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MethodReference4 {
	public static void main(String[] args) {
		
		//4. System.out.println메서드 method reference
		//파라미터 o,리턴값x
		Consumer<String> c = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		Consumer<String> cc = t->System.out.println(t);
		Consumer<String> ccc = System.out::println;; //매우 중요
		ccc.accept("hong");

	}
}

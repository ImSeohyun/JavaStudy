package exam02;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		//익명클래스
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Consumer: "+t);
			}
		};
		c.accept("홍길동");
		
		//람다표현식
		Consumer<String> c2 = t -> {
			System.out.println("람다 Consumer "+t);
		};
		c2.accept("이순신");
		
		/////////////IntConsumer//////////////
		IntConsumer ic = new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println("IntConsumer "+value);
			}
		};
		ic.accept(10);
		//람다
		IntConsumer ic2 = value-> {
			System.out.println("IntConsumer "+value);
		};
		ic2.accept(20);
	}//end main
}//end class

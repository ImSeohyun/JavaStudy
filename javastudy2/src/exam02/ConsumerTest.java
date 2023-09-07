package exam02;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {
	public static void main(String[] args) {
		
		//�͸�Ŭ����
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Consumer: "+t);
			}
		};
		c.accept("ȫ�浿");
		
		//����ǥ����
		Consumer<String> c2 = t -> {
			System.out.println("���� Consumer "+t);
		};
		c2.accept("�̼���");
		
		/////////////IntConsumer//////////////
		IntConsumer ic = new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println("IntConsumer "+value);
			}
		};
		ic.accept(10);
		//����
		IntConsumer ic2 = value-> {
			System.out.println("IntConsumer "+value);
		};
		ic2.accept(20);
	}//end main
}//end class

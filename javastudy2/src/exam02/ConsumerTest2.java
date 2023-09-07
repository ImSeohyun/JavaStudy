package exam02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest2 {
	public static void main(String[] args) {
		//�Ķ���� 2���� ���
		
		//�͸�Ŭ����
		BiConsumer<String, Integer> x = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println("BiConsumer "+ t + "\t"+u);
			}
		};
		x.accept("hong", 14);
		
		//����ǥ����
		BiConsumer<String, Integer> x2 = (t,u) -> {
			System.out.println("���� BiConsumer "+ t + "\t"+u);
		};
		x2.accept("�̼���",15);
		
		////////ObjIntConsumer////////////
		//�͸�Ŭ����
		ObjIntConsumer<String> y = new ObjIntConsumer<String>() {
			@Override
			public void accept(String t, int value) {
				System.out.println("ObjIntConsumer "+ t + "\t"+value);
			}
		};
		y.accept("hong", 14);
		//����
		ObjIntConsumer<String> y2 = (t,value)->{
			System.out.println("���� ObjIntConsumer "+ t + "\t"+value);
		};
		y2.accept("h", 22);
		
	}//end main
}//end class

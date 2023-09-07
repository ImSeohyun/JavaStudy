package exam02;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		//�Ķ���� 2���� ���
		
		//�͸�Ŭ����
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "ȫ�浿";
			}
		};
		System.out.println(s.get());
		
		//����ǥ����
		Supplier<String> s1 =()-> "ȫ�浿";
		System.out.println(s1.get());
		
		////////BooleanSupplier////////////
		//�͸�Ŭ����
		int num =10;
		BooleanSupplier x = new BooleanSupplier() {
			@Override
			public boolean getAsBoolean() {
				return num%2==0;
			}
		};
		System.out.println("num���� ¦��? "+ x.getAsBoolean());
		//����
		BooleanSupplier x2 = ()->num%2==0;
		System.out.println("num���� ¦��? "+ x2.getAsBoolean());

		/////intSupplier////
		String name = "ȫ�浿";
		IntSupplier y = new IntSupplier() {
			@Override
			public int getAsInt() {
				return name.length();
			}
		};
		int y2 = y.getAsInt();
		System.out.println("name ���ڿ� ���� "+y2);
		
		//����
		IntSupplier y3 = () -> name.length();
		
	}//end main
}//end class

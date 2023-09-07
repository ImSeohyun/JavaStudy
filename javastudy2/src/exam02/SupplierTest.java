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
		//파라미터 2개인 경우
		
		//익명클래스
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "홍길동";
			}
		};
		System.out.println(s.get());
		
		//람다표현식
		Supplier<String> s1 =()-> "홍길동";
		System.out.println(s1.get());
		
		////////BooleanSupplier////////////
		//익명클래스
		int num =10;
		BooleanSupplier x = new BooleanSupplier() {
			@Override
			public boolean getAsBoolean() {
				return num%2==0;
			}
		};
		System.out.println("num값이 짝수? "+ x.getAsBoolean());
		//람다
		BooleanSupplier x2 = ()->num%2==0;
		System.out.println("num값이 짝수? "+ x2.getAsBoolean());

		/////intSupplier////
		String name = "홍길동";
		IntSupplier y = new IntSupplier() {
			@Override
			public int getAsInt() {
				return name.length();
			}
		};
		int y2 = y.getAsInt();
		System.out.println("name 문자열 길이 "+y2);
		
		//람다
		IntSupplier y3 = () -> name.length();
		
	}//end main
}//end class

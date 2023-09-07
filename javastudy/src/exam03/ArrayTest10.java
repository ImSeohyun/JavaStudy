package exam03;

import java.util.Arrays;

public class ArrayTest10 {

	//기본형 인자
	public static void pdt(int n) {
		System.out.println("pdt: "+n);
		n =20;
	}
	
	//참조형 인자
	public static void rdt(int[] x) {
		System.out.println("rdt:"+x);
		System.out.println("rdt:"+Arrays.toString(x));
		
	}
	
	public static void main(String[] args) {
		
		//기본형 데이터 (call by value로 전달. 값이 복사되기 때문에 원본값 변경 안됨)
		int n=1;
		System.out.println("호출전 n값: "+n);
		pdt(n);
		System.out.println("호출후 n값: "+n); //n의 변동없이 1임
		
		//참조형 데이터
		int[] n2 = {1,2,3};
		System.out.println("호출전 n2값:"+Arrays.toString(n2));
		rdt(n2);
		
	}
	
}

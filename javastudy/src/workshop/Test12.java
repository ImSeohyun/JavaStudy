package workshop;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수 구하기");
		int a = s.nextInt();

		while(a<0) {
			System.out.println("정수 값:"+a);
			a = s.nextInt();
		}
		System.out.println("정수 값:"+a);
		System.out.println("그 수는 "+Integer.toString(a).length()+"자리입니다.");
		
		
	}

}

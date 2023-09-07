package workshop;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a의 값:"+a);

		while(b <=a) {
			System.out.println("b의 값:"+b);
			System.out.println("a보다 큰 값을 입력하세요");
			b = s.nextInt();
		}
		System.out.println("b의 값:"+b);
		System.out.println("b-a는 "+(b-a)+"입니다.");
		
		
	}

}

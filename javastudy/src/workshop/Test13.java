package workshop;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하세요");
		
		int i = s.nextInt();
		while(i <10 || i>99) {
			System.out.println("입력 :"+ i);
			i=s.nextInt();
		}
		System.out.println("입력 :"+ i);
		System.out.println("입력값은 "+ i);
		
	}
}

package calc;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
		while(data<5 || data>10) {
			System.out.println("다시 입력하세요");
			data = s.nextInt();
		}
		Calc c = new Calc();
		System.out.println("결과: "+c.calculate(data));
		
	}

}

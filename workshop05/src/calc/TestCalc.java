package calc;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
		while(data<5 || data>10) {
			System.out.println("�ٽ� �Է��ϼ���");
			data = s.nextInt();
		}
		Calc c = new Calc();
		System.out.println("���: "+c.calculate(data));
		
	}

}

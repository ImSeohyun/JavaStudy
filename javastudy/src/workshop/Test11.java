package workshop;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("a�� ��:"+a);

		while(b <=a) {
			System.out.println("b�� ��:"+b);
			System.out.println("a���� ū ���� �Է��ϼ���");
			b = s.nextInt();
		}
		System.out.println("b�� ��:"+b);
		System.out.println("b-a�� "+(b-a)+"�Դϴ�.");
		
		
	}

}

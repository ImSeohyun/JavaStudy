package workshop;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("2�ڸ��� ������ �Է��ϼ���");
		
		int i = s.nextInt();
		while(i <10 || i>99) {
			System.out.println("�Է� :"+ i);
			i=s.nextInt();
		}
		System.out.println("�Է� :"+ i);
		System.out.println("�Է°��� "+ i);
		
	}
}

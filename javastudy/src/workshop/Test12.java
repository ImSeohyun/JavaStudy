package workshop;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("���� �������� �ڸ��� ���ϱ�");
		int a = s.nextInt();

		while(a<0) {
			System.out.println("���� ��:"+a);
			a = s.nextInt();
		}
		System.out.println("���� ��:"+a);
		System.out.println("�� ���� "+Integer.toString(a).length()+"�ڸ��Դϴ�.");
		
		
	}

}

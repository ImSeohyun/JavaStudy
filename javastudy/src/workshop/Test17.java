package workshop;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ ���� ������ �ﰢ��");
		
		System.out.print("�� �� �ﰢ���Դϱ�? :");
		int n =s.nextInt();

		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

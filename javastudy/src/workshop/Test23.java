package workshop;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		System.out.print("�����Ǽ� �Է�: ");
		int num=scan.nextInt();
		 int sum=0;
		int i=num;
		while (1<=i){ 
		 sum+=i;
		 i--;
		}
		System.out.println("�Է��Ͻ� ������ ����:"+sum);
	}
}

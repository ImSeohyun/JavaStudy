package workshop;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϱ�");
		
		int n = s.nextInt();
		while(n <=0) {
			System.out.println("n ��:"+n);
			n = s.nextInt();
		}
		int sum =0;
		for(int i=0; i<=n;i++) {
			sum+=i;
		}
		System.out.println("1���� "+n+"������ ����:"+sum);
	}
}

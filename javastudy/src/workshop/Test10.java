package workshop;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 총합 구하기");
		
		int n = s.nextInt();
		while(n <=0) {
			System.out.println("n 값:"+n);
			n = s.nextInt();
		}
		int sum =0;
		for(int i=0; i<=n;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 총합:"+sum);
	}
}

package workshop;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		System.out.println("한 자리 정수값을 입력하시오");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		int r =1;
		int sum =0;
		String str ="";
		
		while(i*r<=100) {
			str += i*r+"+";
			sum += i*r;
			r++;
		}
		str +="="+sum;
		System.out.println(str);
		
	}
}

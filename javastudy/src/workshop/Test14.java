package workshop;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("---- °ö¼ÀÇ¥ ----");

		for(int i=1; i<=9;i++) {
			String str ="";
			for(int j=1;j<=9;j++) {
				str +=i*j+" ";
			}
			System.out.println(str);
		}
	}
}

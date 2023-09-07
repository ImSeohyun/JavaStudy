package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {

		if(args.length<2||args.length>2) {
			System.out.println("다시 입력 하세요");
		}else if(!(Arrays.asList(args).contains("1")||Arrays.asList(args).contains("2")
				||Arrays.asList(args).contains("3")||Arrays.asList(args).contains("4")
				||Arrays.asList(args).contains("5"))) {
			System.out.println("숫자를 확인 하세요");
		}else {
			int[][] a = new int[2][2];
			int sum = 0;
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j] =(int)(Math.random()*(5-1+1))+1;
					System.out.print(a[i][j]+" ");
					sum +=a[i][j];
				}
				System.out.println();
			}
			double avg = sum / 4.0;
			
			System.out.println("sum="+sum);
			System.out.println("avg="+avg);
			
			
		}

	}
}

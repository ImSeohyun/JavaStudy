package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest09 {

	public static void main(String[] args) {

		int[] arr3 = new int[5];
		
		int sum=0;
		for(int i=0; i<arr3.length;i++) {
			arr3[i]= (int)(Math.random()*(10-1+1))+1;
			System.out.print(arr3[i]+" ");
			sum += arr3[i];
		}
		System.out.println();
		System.out.println("sum="+sum);
		
		double avg = sum / 5.0;
		System.out.println("avg="+avg);
	}
}

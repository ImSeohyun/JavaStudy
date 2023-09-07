package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int people = s.nextInt();
		
		int[] arr = new int[people];
		
		for(int i=1;i<=people;i++) {
			arr[i-1] = (int)(Math.random()*(200-100+1))+100;
			System.out.println("사람 "+i+": "+arr[i-1]);
			
		}
		
		Arrays.sort(arr);
		System.out.println("최댓값은 "+arr[arr.length-1]+"입니다.");
	}
}

package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		int people = s.nextInt();
		
		int[] arr = new int[people];
		
		for(int i=1;i<=people;i++) {
			System.out.print("��� "+i+" ");
			arr[i-1] = s.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("�ִ��� "+arr[arr.length-1]+"�Դϴ�.");
	}
}

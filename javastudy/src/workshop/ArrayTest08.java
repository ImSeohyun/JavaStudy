package workshop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest08 {

	public static void main(String[] args) {

		int [] score= {99,34,67,22,11,9};
		
		Arrays.sort(score);
		System.out.println("�ִ밪: "+ score[score.length-1]);
		System.out.println("�ּҰ�: "+ score[0]);
	}
}

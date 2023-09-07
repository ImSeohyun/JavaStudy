package exam02;

import java.util.Scanner;

public class IFTest3 {

	public static void main(String[] args) {
		
		//다중 if문
		
		int num=70;
		if(num >=90) {
			System.out.println("A 학점");
		}else if(num>=90){
			System.out.println("B 학점");
		}else if(num>=70) {
			System.out.println("C 학점");
		}else {
			System.out.println("D 학점");
		}
	}
}

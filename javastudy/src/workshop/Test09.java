package workshop;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int max = 0;
		
		System.out.println("a 값: "+a);
		System.out.println("b 값: "+b);
		System.out.println("c 값: "+c);
		
		  if(a >= b){
			    if(a >=c){
			    	max = a;
			    }else{
			    	max = c;
			    }
			  }else{
			    if(b>=c){
			      max = b;
			    }else{
			    	max = c;
			    }
			  }
//		  int max = a;
//			if(b>max)max=b;
//			if(c>max)max=c;
		 System.out.println("최대값: "+ max);
	}
}

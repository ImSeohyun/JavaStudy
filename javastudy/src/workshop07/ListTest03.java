package workshop07;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		Random r = new Random();
		for(int i=1;i<=10;i++) {
			list1.add(r.nextInt(9));
			list2.add(r.nextInt(9));
		}
		for(int i=0;i<10;i++){
			 // 첫 번째 ArrayList의 1번쨰부터 10번째까지의 숫자를 두 번째 ArrayList의
			// 1번쨰부터 10번째까지의 숫자로 나누는 연산 처리를 진행 한다.
			try {
				System.out.println(list1.get(i)+"/"+list2.get(i)+" "+list1.get(i)/list2.get(i));			
			}catch(ArithmeticException e) {  // 적합한 클래스, 다형성 적용 가능
				System.out.println(list1.get(i)+"/"+list2.get(i)+" 분모가 0입니다");			
			}
			
		}
	}
}

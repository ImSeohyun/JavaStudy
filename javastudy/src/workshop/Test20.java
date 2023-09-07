package workshop;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("보너스 및 월급 구하기");
		System.out.println("근무시간입력: ");
		int hour = s.nextInt();
		System.out.println("월급입력: ");
		int money = s.nextInt();
		System.out.println("===============");
		int bonus = 0;
		if(hour >=25) {
			bonus = money*100/100;
		}else if(hour >=20) {
			bonus = money*80/100;			
		}else if(hour >=18) {
			bonus = money*50/100;			
		}
		System.out.println("보너스 :"+bonus);
		System.out.println("지급될 급여 :"+(bonus+money));
	}
}

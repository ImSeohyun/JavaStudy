package workshop;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("���ʽ� �� ���� ���ϱ�");
		System.out.println("�ٹ��ð��Է�: ");
		int hour = s.nextInt();
		System.out.println("�����Է�: ");
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
		System.out.println("���ʽ� :"+bonus);
		System.out.println("���޵� �޿� :"+(bonus+money));
	}
}

package company;

import java.util.Scanner;

public class TestCompany {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int salary = s.nextInt();
		Company c = new Company(salary);
		
		System.out.println("�� �⺻�� ��: "+c.getIncome()+" ����: "+c.getAfterTaxIncome());
		System.out.println("�� ���ʽ� ��: "+c.getBonus()+" ����: "+Math.round(c.getAfterTaxBonus()*10)/10.0);
		System.out.println("�� ���޾� ��: "+ (c.getAfterTaxBonus()+c.getAfterTaxIncome()));
		
		
	}
}

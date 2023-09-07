package company;

import java.util.Scanner;

public class TestCompany {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int salary = s.nextInt();
		Company c = new Company(salary);
		
		System.out.println("연 기본급 합: "+c.getIncome()+" 세후: "+c.getAfterTaxIncome());
		System.out.println("연 보너스 합: "+c.getBonus()+" 세후: "+Math.round(c.getAfterTaxBonus()*10)/10.0);
		System.out.println("연 지급액 합: "+ (c.getAfterTaxBonus()+c.getAfterTaxIncome()));
		
		
	}
}
